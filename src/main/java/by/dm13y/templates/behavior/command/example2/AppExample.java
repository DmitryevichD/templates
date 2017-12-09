package by.dm13y.templates.behavior.command.example2;

import java.util.ArrayList;
import java.util.List;

public class AppExample {
    public static void main(String[] args) {
        List<Command> commandList = new ArrayList<>();
        NumService numService = new NumService();
        commandList.add(new InfoCommand());
        commandList.add(new AddNumComand(numService));
        for (int i = 0; i < 100; i++) {
            final Integer arg1 = i;
            final Integer arg2 = i + 100;
            commandList.forEach(command -> command.execute(arg1, arg2));
        }
    }
}
