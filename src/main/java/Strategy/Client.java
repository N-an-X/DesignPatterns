package Strategy;

public class Client {

    public static void main(String[] args) {
        Context contextA = new ContextImpl(new ConcreteStrategyA());
        Context contextB = new ContextImpl(new ConcreteStrategyB());
        Context contextC = new ContextImpl(new ConcreteStrategyC());

        System.out.println(contextA.executeStrategy());
        System.out.println(contextB.executeStrategy());
        System.out.println(contextC.executeStrategy());
    }
}
