package Observer;

import java.util.List;
import java.util.ArrayList;

public class ConcreteSubject implements Subject {

    private int state;
    private List<Observer> observers;

    public ConcreteSubject(int state) {
        this.state = state;
        this.observers = new ArrayList<>();
    }

    @Override
    public void attach(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        this.observers.forEach((observer) -> observer.update());
    }

    @Override
    public int getState() {
        return this.state;
    }

    @Override
    public void setState(int state) {
        this.state = state;
        this.notifyObservers();
    }
}
