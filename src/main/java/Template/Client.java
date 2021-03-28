package Template;

public class Client {
    public static void main(String[] args) {
        HummerModel h1 = new HummerH1Model();

        HummerModel h2 = new HummerH2Model();

        h1.run();

        System.out.println("------------------------------");

        h2.run();
    }
}
