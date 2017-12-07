package by.dm13y.templates.behavior.memento;

public class Memento {
    private final Object state;

    public Memento(Object state){
        this.state = state;
    }

    public Object getSavedState(){
        return state;
    }


}
