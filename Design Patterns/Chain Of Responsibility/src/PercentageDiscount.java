public class PercentageDiscount extends Handler{
    @Override
    public double applyDiscount(Delivery delivery) {
        delivery.setDiscount(delivery.getAmount() - delivery.getAmount()*0.01);
        System.out.println("Percentage Discount Calculated");
        if(!delivery.getOrderMonth().equalsIgnoreCase("december")){
            return delivery.getDiscount();
        }
        else {
            return successor.applyDiscount(delivery);
        }
    }
}
