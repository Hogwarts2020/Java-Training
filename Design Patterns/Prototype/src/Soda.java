public class Soda extends Beverage{
    String flavour;

    public String getFlavour() {
        return flavour;
    }

    public void setFlavour(String flavour) {
        this.flavour = flavour;
    }

    @Override
    public String toString() {
        return "Soda{" +
                "flavour='" + flavour + '\'' +
                ", name='" + name + '\'' +
                ", calories='" + calories + '\'' +
                ", sugarLevel='" + sugarLevel + '\'' +
                '}';
    }
}
