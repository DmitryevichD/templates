package by.dm13y.templates.behavior.chainofresponsibility;

public class InfoLogger extends Logger {

    public InfoLogger() {
        super(3);
    }

    @Override
    protected void writeMsg(String msg) {
        System.out.println(this.getClass().getSimpleName() + ": " + msg);
    }
}
