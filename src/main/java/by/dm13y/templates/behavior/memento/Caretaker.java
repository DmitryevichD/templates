package by.dm13y.templates.behavior.memento;

import java.util.ArrayDeque;
import java.util.Deque;

public class Caretaker {
    private Deque<Memento> status = new ArrayDeque<>();

    public Memento getMement(){
        return status.pop();
    }

    public void setMemento(Memento memento){
        status.add(memento);
    }

}
