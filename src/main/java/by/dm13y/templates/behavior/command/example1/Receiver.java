package by.dm13y.templates.behavior.command.example1;

public class Receiver {
    public void action(String msg){
        System.out.println(this.getClass().getName() + "-" + msg);
    }
}
