package by.dm13y.templates.behavior.command.example1;

public class TextCommand implements Command {
    private String txt;

    public TextCommand(String txt) {
        this.txt = txt;
    }


    @Override
    public void execute() {
        System.out.println(this.getClass().getName() + " - " + txt);
    }
}
