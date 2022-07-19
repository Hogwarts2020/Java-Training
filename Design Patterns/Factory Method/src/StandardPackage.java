public class StandardPackage extends VacationPackage{

    @Override
    protected void createPackage() {
        activities.add(new SafariRide());
        activities.add(new GoCarting());
    }
}
