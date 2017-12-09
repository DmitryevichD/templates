package by.dm13y.templates.behavior.observer;

public class AppExample {
    public static void main(String[] args) {
        Subject sbj = new ConcreteSubject();
        Observer observer = new ConcreteObserver();
        Observer observer1 = new ConcreteObserver();
        Observer observer2 = new ConcreteObserver();

        sbj.attach(observer);
        sbj.attach(observer1);
        sbj.attach(observer2);
        sbj.notifyObs();
    }
}
