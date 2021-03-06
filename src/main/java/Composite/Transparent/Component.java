package Composite.Transparent;

import java.util.List;

public abstract class Component {

    public void doSomething() {

    }

    abstract void add(Component component);
    abstract void remove(Component component);
    abstract List<Component> getChildren();
}
