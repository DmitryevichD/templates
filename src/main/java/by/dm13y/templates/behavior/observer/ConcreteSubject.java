package by.dm13y.templates.behavior.observer;

import java.util.ArrayList;
import java.util.List;

public class ConcreteSubject implements Subject {
    private List<Observer> observerList = new ArrayList<>();
    @Override
    public void notifyObs() {
        observerList.forEach(Observer::update);
    }

    @Override
    public void attach(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observerList.remove(observer);
    }
}
