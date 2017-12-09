package by.dm13y.templates.behavior.command.example1;

public class LoginCommand implements Command {
    private String login;
    private String pwd;


    public LoginCommand(String login, String pwd) {
        this.login = login;
        this.pwd = pwd;
    }


    @Override
    public void execute() {
        System.out.println(this.getClass().getName() + "Login in with " + login + ", " + pwd);
    }
}
