package Command;

public class Client {
    public static void main(String[] args) {
        Invoker zhaoSi = new Invoker();

        System.out.println("---一个新的需求---");

        Command command = new AddRequirementCommand();

        zhaoSi.setCommand(command);

        zhaoSi.action();

        System.out.println("---又一个新的需求---");

        Command command1 = new DeletePageCommand();

        zhaoSi.setCommand(command1);

        zhaoSi.action();
    }
}
