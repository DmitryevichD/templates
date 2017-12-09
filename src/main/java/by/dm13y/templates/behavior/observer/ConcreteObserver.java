package by.dm13y.templates.behavior.observer;

public class ConcreteObserver implements Observer{
    @Override
    public void update() {
        System.out.println(this.getClass().getName() + ": is notes");
    }
}
