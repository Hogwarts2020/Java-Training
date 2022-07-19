public class Cappuccino  extends Beverage{
    String topping;

    public String getTopping() {
        return topping;
    }

    public void setTopping(String topping) {
        this.topping = topping;
    }

    @Override
    public String toString() {
        return "Cappuccino{" +
                "topping='" + topping + '\'' +
                ", name='" + name + '\'' +
                ", calories='" + calories + '\'' +
                ", sugarLevel='" + sugarLevel + '\'' +
                '}';
    }
}
