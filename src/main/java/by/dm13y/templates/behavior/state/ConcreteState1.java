package by.dm13y.templates.behavior.state;

public class ConcreteState1 implements State {
    @Override
    public void handle(Context context, char letter) {
        System.out.print(String.valueOf(letter).toLowerCase());
        if(letter == ' '){
            context.setState(new ConcreteState2());
        }
    }
}
