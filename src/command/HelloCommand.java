package command;

public class HelloCommand implements ICommand {
    @Override
    public void execute() {
        System.out.println("Hello world");
    }
}
