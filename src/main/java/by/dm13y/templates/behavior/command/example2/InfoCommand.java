package by.dm13y.templates.behavior.command.example2;

public class InfoCommand implements Command {
    @Override
    public void execute(Integer num1, Integer num2) {
        System.out.println("INFO: arg1=" + num1 + " arg2=" + num2);
    }
}
