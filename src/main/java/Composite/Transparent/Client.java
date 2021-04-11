package Composite.Transparent;

//与安全的组合模式不同的是，透明组合模式基本遵循了依赖倒置原则，方便进行扩展
public class Client {
    public static void display(Component root) {
        for (Component c: root.getChildren()) {
            if (c instanceof Leaf) {
                c.doSomething();
            } else {
                display(c);
            }
        }
    }
}
