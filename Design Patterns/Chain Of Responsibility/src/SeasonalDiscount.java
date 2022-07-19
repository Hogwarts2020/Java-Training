public class SeasonalDiscount extends Handler{
    @Override
    public double applyDiscount(Delivery delivery) {
        delivery.setDiscount(delivery.getAmount() - delivery.getAmount()*0.02);
        System.out.println("Seasonal Discount Calculated");
        if(delivery.getDeliveryNumber() != 1){
            return delivery.getDiscount();
        }
        else {
            return successor.applyDiscount(delivery);
        }
    }
}
