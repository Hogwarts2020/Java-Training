public class Delivery {
    private int deliveryNumber;
    private double amount;
    private double discount;

    private String orderMonth;

    protected void setDiscount(double discount) {
        this.discount = discount;
    }


    public Delivery(int deliveryNumber, double amount, String orderMonth) {
        this.deliveryNumber = deliveryNumber;
        this.amount = amount;
        this.orderMonth = orderMonth;
    }


    public int getDeliveryNumber() {
        return deliveryNumber;
    }

    public double getAmount() {
        return amount;
    }


    public double getDiscount() {
        return discount;
    }

    public String getOrderMonth() {
        return orderMonth;
    }
}
