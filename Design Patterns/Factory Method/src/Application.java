public class Application {
    public static void main (String [] args) {
        VacationPackage vacationPackage = VacationFactory.createPackage(PackageCode.BASIC);
        System.out.println(vacationPackage);

        VacationPackage vacationPackage1 = VacationFactory.createPackage(PackageCode.LUXURY);
        System.out.println(vacationPackage1);
    }
}
