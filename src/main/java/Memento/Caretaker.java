package Memento;

import java.util.List;
import java.util.ArrayList;

public class Caretaker {

    private List<Memento> mementos;

    public Caretaker() {
        this.mementos = new ArrayList<>();
    }

    public void addMemento(Memento memento) {
        this.mementos.add(memento);
    }

    public Memento getMemento(int num) {
        if (num < 0 || num > mementos.size() - 1) {
            return null;
        }
        return mementos.get(num);
    }
}
