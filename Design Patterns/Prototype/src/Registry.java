import java.util.HashMap;
import java.util.Map;

public class Registry {
    private Map<BeverageType,Beverage> beverages = new HashMap<>();

    public Registry() {
        this.initialize();
    }

    public Beverage getBeverage (BeverageType beverageType){
        Beverage beverage = null;
        beverage =  (Beverage) beverages.get(beverageType).clone();
        return beverage;
    }


    private void initialize() {
        Soda soda = new Soda();
        soda.name="Coke";
        soda.calories = "180 calories";
        soda.sugarLevel = "High";
        soda.flavour = "cola";

        Cappuccino cappuccino = new Cappuccino();
        cappuccino.name = "Iced Cappuccino";
        cappuccino.calories = "80 calories";
        cappuccino.sugarLevel = "Medium";
        cappuccino.topping = "Whipped Cream";

        beverages.put(BeverageType.SOFTDRINK,soda);
        beverages.put(BeverageType.HOTDRINK,cappuccino);

    }
}
