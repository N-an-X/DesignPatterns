package AbstractFactory;

public abstract class AbstractBlackHuman implements Human{

    @Override
    public void getColor() {
        System.out.println("黑色人中的皮肤是黑色的。");
    }

    @Override
    public void talk() {
        System.out.println("黑人会说话，但是一般听不懂。");
    }
}
