package Bridge;

public class House extends Product{
    @Override
    public void beProducted() {
        System.out.println("生产出的房子是这样子的。。。");
    }

    @Override
    public void beSelled() {
        System.out.println("生产出的房子卖出去了。。。");
    }
}
