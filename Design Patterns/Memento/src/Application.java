public class Application {
    public static void main (String [] args){
        CareTaker careTaker = new CareTaker();
        Cake cake = new Cake();
        cake.addTopping(new Topping("Chocolate Curls"));
        cake.addTopping(new Topping("Fresh Fruits"));
        careTaker.save(cake);
        System.out.println(cake);
        cake.addTopping(new Topping("Nuts"));
        careTaker.save(cake);
        System.out.println(cake);
        cake.addTopping(new Topping("Moldable fondant"));
        cake.addTopping(new Topping("Icing"));

        careTaker.revert(cake);




    }
}

