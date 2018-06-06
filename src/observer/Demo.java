package observer;

/**
 * Run main() to see how to use the classes in this package.
 */
public class Demo {

    public static void main(String[] args) {
        Subject subject = new Subject();
        
        Observer o1 = new Observer("Observer1");
        subject.attach(o1);
        
        Observer o2 = new Observer("Observer2");
        subject.attach(o2);
        
        Observer o3 = new Observer("Observer3");
        subject.attach(o3);
        
        subject.dettach(o1);
        
        subject.notifyUpdate("test");
    }

}
