package ChainofResponsibility;

//封建习俗之三从
public abstract class Handler {

    public final static int FATHER_LEVEL = 1;

    public final static int HUSBAND_LEVEL = 2;

    public final static int SON_LEVEL = 3;

    private int level;

    private Handler nextHandler;

    public Handler(int level) {
        this.level = level;
    }

    //模版方法模式
    public final void HandleMessage(IWomen women) {
        if (women.getType() == this.level) {
            this.response(women);
        } else {
            if (this.nextHandler != null) {
                this.nextHandler.HandleMessage(women);
            } else {
                System.out.println("---没地方去请示了，那就不可以---\n");
            }
        }
    }

    public void setNext(Handler handler) {
        this.nextHandler = handler;
    }

    protected abstract void response(IWomen women);

}
