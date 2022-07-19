public class FirstCustomerDiscount extends Handler{
    @Override
    public double applyDiscount(Delivery delivery) {
        delivery.setDiscount(delivery.getAmount() - delivery.getAmount()*0.03);
        System.out.println("First Customer Discount Calculated");
        return delivery.getDiscount();

    }
}
