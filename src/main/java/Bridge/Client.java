package Bridge;

import Composite.Crop;

//优秀的扩展能力，抽象和实现分离，解藕
public class Client {
    public static void main(String[] args) {
        House house = new House();
        System.out.println("---房地产公司是这样子赚钱的---");
        Corp houseCorp = new HouseCorp(house);
        houseCorp.makeMoney();
        System.out.println();
        System.out.println("---山寨公司是这样子赚钱的---");
        ShanZhaiCorp shanZhaiCrop = new ShanZhaiCorp(new IPod());
        shanZhaiCrop.makeMoney();
    }
}
