public class AudioPlayer {
    private static volatile AudioPlayer audioPlayer;

    private AudioPlayer() {
        if (audioPlayer != null){
            throw new RuntimeException("Please use getInstance Method");
        }
    }

    public static AudioPlayer getInstance(){
        if (audioPlayer == null) {
            synchronized (AudioPlayer.class){
                if (audioPlayer == null){
                    audioPlayer = new AudioPlayer();
                }
            }
        }
        return audioPlayer;
    }

    public void playMusic(String music) {
        System.out.println("Now playing......." + music);
    }

}
