package AbstractFactory;

public abstract class AbstractYellowHuman implements Human{

    @Override
    public void getColor() {
        System.out.println("黄色人种的皮肤是黄色的。");
    }

    @Override
    public void talk() {
        System.out.println("黄色人种会说话，说的一般都是双节字。");
    }
}
