public class LuxuryPackage extends VacationPackage{
    @Override
    protected void createPackage() {
        activities.add(new SafariRide());
        activities.add(new GoCarting());
        activities.add(new BungeeJumping());
        activities.add(new Pottery());
    }
}
