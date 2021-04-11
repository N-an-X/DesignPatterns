package Bridge;

public class ShanZhaiCorp extends Corp{
    public ShanZhaiCorp(Product product) {
        super(product);
    }

    public void makeMoney() {
        super.makeMoney();
        System.out.println("山寨公司赚钱啊。。。");
    }
}
