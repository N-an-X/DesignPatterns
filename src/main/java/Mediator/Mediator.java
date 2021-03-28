package Mediator;

public class Mediator extends AbstractMediator{
    @Override
    void execute(String str, Object... objects) {
        switch (str) {
            case "purchase.buy": //采购电脑
                this.buyComputer((Integer) objects[0]);
                break;
            case "sale.sell": //销售电脑
                this.sellComputer((Integer) objects[0]);
                break;
            case "sale.offsell": //折扣销售
                this.offSell();
                break;
            case "stock.clear": //清仓甩卖
                this.clearStock();
                break;
        }
    }

    private void buyComputer(int number) {
        int saleStatus = super.sale.getSaleStatus();
        if (saleStatus > 80) {
            System.out.println("采购IBM电脑： " + number + "台");
            super.stock.increase(number);
        } else {
            int buyNumber = number / 2;
            System.out.println("采购IBM电脑： " + buyNumber + "台");
        }
    }

    private void sellComputer(int number) {
        if (super.stock.getStockNumber() < number) {
            super.purchase.buyIBMComputer(number);
        }
        super.stock.decrease(number);
    }

    private void offSell() {
        System.out.println("折扣销售IBM电脑" + stock.getStockNumber() + "台");
        int count = stock.getStockNumber();
        super.stock.decrease(count);
    }

    private void clearStock() {
        super.sale.offSale();

        super.purchase.refuseBuyIBM();
    }
}
