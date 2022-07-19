import java.util.Stack;

public class CareTaker {
    Stack<Cake.CakeMomento> history = new Stack<>();
    public void save (Cake cake){
        history.push(cake.save());
    }

    public void revert (Cake cake){
        if (!history.isEmpty()){
            cake.revert(history.pop());
        }
        else System.out.println("Cannot Undo");
    }
}
