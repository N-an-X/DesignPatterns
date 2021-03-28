package Strategy;

public class ContextImpl implements Context {

    private Strategy strategy;

    public ContextImpl(Strategy strategy) {
        this.strategy = strategy;
    }

    public int executeStrategy() {
        return this.strategy.doOperation(3, 3);
    }
}
