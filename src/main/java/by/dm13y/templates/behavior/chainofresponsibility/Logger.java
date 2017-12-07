package by.dm13y.templates.behavior.chainofresponsibility;

public abstract class Logger {
    private Logger next;
    private int logLevel;

    public Logger(int logLevel){
        this.logLevel = logLevel;
    }

    public void handle(String msg, int level){
        if (this.logLevel > level) {
            writeMsg(msg);
        }
        if (getNext() != null) {
            getNext().handle(msg, level);
        }
    }

    private Logger getNext() {
        return next;
    }

    public void setNext(Logger next) {
        this.next = next;
    }

    protected abstract void writeMsg(String msg);
}
