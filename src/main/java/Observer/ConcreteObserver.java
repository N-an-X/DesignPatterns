package Observer;

public class ConcreteObserver implements Observer {

    private Subject subject;

    public ConcreteObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Updated about state change: " + subject.getState());
    }
}
