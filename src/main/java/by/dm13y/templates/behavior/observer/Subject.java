package by.dm13y.templates.behavior.observer;

public interface Subject {
    void notifyObs();
    void attach(Observer observer);
    void detach(Observer observer);
}
