package State;

public class Context {

    private State state;

    public Context() {
        this.state = new LowerCaseState();
    }

    public void displayText(String text) {
        state.displayText(this, text);
    }

    public void setState(State state) {
        this.state = state;
    }
}
