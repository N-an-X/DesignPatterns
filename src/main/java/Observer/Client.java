package Observer;

public class Client {

    public static void main(String[] args) {

        Subject subject = new ConcreteSubject(1);

        Observer[] observers = new ConcreteObserver[] {
            new ConcreteObserver(subject),
            new ConcreteObserver(subject),
            new ConcreteObserver(subject),
        };

        subject.setState(5);
    }
}
