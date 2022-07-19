import java.util.ArrayList;

public class Cake {
     ArrayList<Topping> toppings = new ArrayList<>();

     public void addTopping(Topping topping){
          toppings.add(topping);
     }

     public ArrayList<Topping> getToppings(){
         return (ArrayList)toppings.clone();
     }

     public CakeMomento save(){
          return new CakeMomento(getToppings());
     }

     public void revert(CakeMomento cakeMomento){
          toppings = cakeMomento.getToppings();
     }

     @Override
     public String toString() {
          return "Cake{" +
                  "toppings=" + toppings +
                  '}';
     }

     static class CakeMomento{
          ArrayList<Topping> toppings;

          public CakeMomento(ArrayList<Topping> toppings) {
               this.toppings = toppings;
          }

          private ArrayList<Topping> getToppings() {
               return toppings;
          }
     }

}
