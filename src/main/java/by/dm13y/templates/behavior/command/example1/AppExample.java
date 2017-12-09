package by.dm13y.templates.behavior.command.example1;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class AppExample {
    private Queue<Command> commandQueue = new ConcurrentLinkedQueue<>();

    public void addCommand(Command cmd){
        commandQueue.add(cmd);
    }

    public static void main(String[] args) {
        AppExample example = new AppExample();
        Receiver receiver1 = new Receiver();
        Receiver receiver2 = new Receiver();
        example.addCommand(new Command2Receiver("Out1", receiver1));
        example.addCommand(new Command2Receiver("Out2", receiver1));
        example.addCommand(new Command2Receiver("Out3", receiver1));
        example.addCommand(new Command2Receiver("Out4", receiver2));
        example.addCommand(new Command2Receiver("Out5", receiver2));
        example.addCommand(new LoginCommand("MyLogin", "MyPWD"));
        example.addCommand(new TextCommand("MyCmd"));
        example.processCommands();
    }

    private void processCommands() {
        commandQueue.forEach(Command::execute);
    }
}
