package State;

public class MultipleUpperCaseState implements State {

    private int count = 0;

    @Override
    public void displayText(Context context, String text) {
        System.out.println(text.toUpperCase());
        count ++;
        if (count == 5) {
            context.setState(new LowerCaseState());
        }
    }
}
