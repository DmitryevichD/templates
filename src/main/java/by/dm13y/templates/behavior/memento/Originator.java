package by.dm13y.templates.behavior.memento;

public class Originator {
    private Object state;

    public void setState(Object state){
        this.state = state;
    }

    public Object getState(){
        return state;
    }

    public Memento saveState(){
        return new Memento(state);
    }

    public void restoreState(Memento memento) {
        this.state = memento.getSavedState();
    }
}
