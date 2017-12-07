package by.dm13y.templates.behavior.chainofresponsibility;

import sun.rmi.runtime.Log;

public class AppExample {
    public static void main(String[] args) {
        Logger infoLogger = new InfoLogger();
        Logger errLogger = new ErrorLogger();

        infoLogger.setNext(errLogger);

        infoLogger.handle("TestMsg0", 0);
        infoLogger.handle("TestMsg1", 1);
        infoLogger.handle("TestMsg2", 2);
        infoLogger.handle("TestMsg3", 3);
        infoLogger.handle("TestMsg4", 4);

    }
}
