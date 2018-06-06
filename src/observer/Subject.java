package observer;

import java.util.ArrayList;

public class Subject {

    private ArrayList<Observer> observers = new ArrayList<>();
    
    public void attach(Observer o) {
        observers.add(o);
    }
    
    public void dettach(Observer o) {
        observers.remove(o);
    }
    
    public void notifyUpdate(Object state) {
        for (Observer o : observers) {
            o.update(state);
        }
    }
}
