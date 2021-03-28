package State;

public class LowerCaseState implements State {

    @Override
    public void displayText(Context context, String text) {
        System.out.println(text.toLowerCase());
         context.setState(new MultipleUpperCaseState());
    }
}
