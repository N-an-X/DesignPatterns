package ChainofResponsibility;

public class Husband extends Handler{

    public Husband() {
        super(Handler.HUSBAND_LEVEL);
    }

    @Override
    protected void response(IWomen women) {
        System.out.println("---这里是丈夫，妻子向丈夫请求---");
        System.out.println(women.getRequest());
        System.out.println("丈夫的回答是：同意");
    }
}
