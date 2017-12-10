package by.dm13y.templates.behavior.state;

public class Context {
    private State state;

    public Context(State state) {
        this.state = state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void request(char letter){
        state.handle(this, letter);
    }
}
