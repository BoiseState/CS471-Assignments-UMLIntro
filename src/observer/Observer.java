package observer;

public class Observer {
    
    private String name;
    
    public Observer(String name) {
        this.name = name;
    }

    public void update(Object state) {
        System.out.println(name + ": recieved " + state);
    }
}
