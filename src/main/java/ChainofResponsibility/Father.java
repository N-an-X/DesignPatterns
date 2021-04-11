package ChainofResponsibility;

public class Father extends Handler{

    public Father() {
        super(Handler.FATHER_LEVEL);
    }

    @Override
    protected void response(IWomen women) {
        System.out.println("---这里是父亲，女儿向父亲请求---");
        System.out.println(women.getRequest());
        System.out.println("爹地的回答是：同意");
    }
}
