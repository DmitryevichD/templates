package by.dm13y.templates.behavior.state;

public class AppExample {
    public static void main(String[] args) {
        Context context = new Context(new ConcreteState2());

        String str = "exAmPLe StaTe PatTeRn";
        for (Character character : str.toCharArray()) {
            context.request(character);
        }
    }
}
