package ChainofResponsibility;

import javax.print.DocFlavor;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Client {

    public static void main(String[] args) {
        Random random = new Random();

        List<IWomen> womenList = new ArrayList<>();

        for (int i = 0 ; i < 5; i ++) {
            womenList.add(new Women(random.nextInt(4), "我要出去逛街花钱。"));
        }

        Handler father = new Father();

        Handler husband = new Husband();

        Handler son = new Son();

        father.setNext(husband);
        husband.setNext(son);

        for (IWomen women : womenList) {
            father.HandleMessage(women);
            System.out.println();
        }
    }

}
