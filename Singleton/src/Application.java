public class Application {
    public static void main (String[] args){
        String song = "Despacito";
        
        AudioPlayer audioPlayer = AudioPlayer.getInstance();
        audioPlayer.playMusic(song);
    }
}
