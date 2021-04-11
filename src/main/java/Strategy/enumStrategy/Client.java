package Strategy.enumStrategy;

import java.util.Scanner;

public class Client {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        String symbol = scanner.next();
        int b = scanner.nextInt();
        if (symbol.equals("+")) {
            System.out.println(a + symbol + b + "的结果为" + Calculator.ADD.exec(a, b));
        } else {
            System.out.println(a + symbol + b + "的结果为" + Calculator.SUB.exec(a, b));
        }
    }
}
