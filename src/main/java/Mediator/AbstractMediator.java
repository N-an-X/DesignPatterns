package Mediator;

public abstract class AbstractMediator {

    protected Purchase purchase;
    protected Sale sale;
    protected Stock stock;

    public void setAll(Purchase purchase, Sale sale, Stock stock) {
        this.sale = sale;
        this.purchase = purchase;
        this.stock = stock;
    }

    abstract void execute(String str, Object... objects);
}
