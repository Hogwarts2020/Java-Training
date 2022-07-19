public class Application {
    public static void main(String[] args) {

        Registry registry = new Registry();

        Soda soda = (Soda) registry.getBeverage(BeverageType.SOFTDRINK);
        System.out.println(soda.toString());
        soda.name = "Fanta";
        System.out.println(soda.toString());

        Soda soda1 = (Soda) registry.getBeverage(BeverageType.SOFTDRINK);
        System.out.println(soda1.toString());

    }
}
