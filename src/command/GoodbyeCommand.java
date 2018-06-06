package command;

public class GoodbyeCommand implements ICommand {
    @Override
    public void execute() {
        System.out.println("Goodbye world");
    }
}
