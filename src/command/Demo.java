package command;

/**
 * Run main() to see how to use the classes in this package.
 */
public class Demo {

    public static void main(String[] args) {
        Button btnHello = new Button();
        btnHello.setCommand(new HelloCommand());
        
        Button btnGoodbye = new Button();
        btnGoodbye.setCommand(new GoodbyeCommand());
        
        btnHello.click();
        btnGoodbye.click();
    }

}
