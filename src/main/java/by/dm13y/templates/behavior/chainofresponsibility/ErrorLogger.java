package by.dm13y.templates.behavior.chainofresponsibility;

public class ErrorLogger extends Logger {

    public ErrorLogger() {
        super(1);
    }

    @Override
    protected void writeMsg(String msg) {
        System.out.println(this.getClass().getSimpleName() + ": " + msg);
    }
}
