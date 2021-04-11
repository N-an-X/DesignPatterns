package ChainofResponsibility;

public class Son extends Handler{

    public Son() {
        super(Handler.SON_LEVEL);
    }

    @Override
    protected void response(IWomen women) {
        System.out.println("---这里是儿子：母亲向儿子进行请求---");
        System.out.println(women.getRequest());
        System.out.println("儿子的回答是：同意");
    }
}
