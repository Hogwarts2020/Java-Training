public class VacationFactory {
    public static VacationPackage createPackage(PackageCode packageCode){
        switch (packageCode){
            case BASIC: return new BasicPackage();
            case STANDARD:return new StandardPackage();
            case LUXURY: return new LuxuryPackage();
            default: return null;
        }

    }
}
