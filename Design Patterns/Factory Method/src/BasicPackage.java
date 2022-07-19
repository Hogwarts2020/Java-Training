public class BasicPackage extends VacationPackage{
    @Override
    protected void createPackage() {
        activities.add(new SafariRide());
    }
}
