public class Application {
    public static void main(String[] args) {
        PercentageDiscount PD = new PercentageDiscount();
        SeasonalDiscount SD = new SeasonalDiscount();
        FirstCustomerDiscount FCD = new FirstCustomerDiscount();


        PD.setSuccessor(SD);
        SD.setSuccessor(FCD);

        Delivery delivery = new Delivery(1, 50, "december");
        System.out.println(PD.applyDiscount(delivery));

        Delivery delivery1 = new Delivery(2, 100, "december");
        System.out.println(PD.applyDiscount(delivery1));

        Delivery delivery2 = new Delivery(3,150,"march");
        System.out.println(PD.applyDiscount(delivery2));

    }
}
