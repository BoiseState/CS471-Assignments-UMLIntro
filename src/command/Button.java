package command;

public class Button {
    private ICommand command;
    
    public void setCommand(ICommand command) {
        this.command = command;
    }
    
    public void click() {
        command.execute();
    }

}
