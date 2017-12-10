package by.dm13y.templates.behavior.state;

public class ConcreteState2 implements State {
    @Override
    public void handle(Context context, char letter) {
        System.out.print(String.valueOf(letter).toUpperCase());
        if(letter != ' '){
            context.setState(new ConcreteState1());
        }
    }
}
