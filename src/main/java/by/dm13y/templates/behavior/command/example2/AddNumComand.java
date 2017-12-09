package by.dm13y.templates.behavior.command.example2;

public class AddNumComand implements Command {
    private NumService numService;
    public AddNumComand(NumService numService) {
        this.numService = numService;
    }

    @Override
    public void execute(Integer num1, Integer num2) {
        System.out.println("Num service operation: " + numService.execOperation(num1, num2));
    }
}
