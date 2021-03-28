package Mediator;

//任何部门只与中介进行交互，中介寻找需要交互的其他对象
public class Client {
    public static void main(String[] args) {
        AbstractMediator mediator = new Mediator();

        System.out.println("---采购人员采购电脑---");

        Purchase purchase = new Purchase(mediator);
        Sale sale = new Sale(mediator);
        Stock stock = new Stock(mediator);

        mediator.setAll(purchase, sale, stock);
        purchase.buyIBMComputer(100);

        System.out.println("\n---销售人员销售电脑---");
        sale.sellIBMComputer(1);

        System.out.println("\n---清理库存---");

        stock.clearStock();

    }
}
