package by.dm13y.templates.behavior.command.example1;

public class Command2Receiver implements Command{
    private final String msg;
    private final Receiver receiver;

    public Command2Receiver(String msg, Receiver receiver) {
        this.msg = msg;
        this.receiver = receiver;
    }


    @Override
    public void execute() {
        receiver.action(msg);
    }
}
