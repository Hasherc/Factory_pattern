package CommandPattern.src;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 91504
 * Date: 2017-11-16
 * Time: 20:42
 */
public class Demo {
    public static void main(String[] args) {
        Stock abcStock = new Stock();
        BuyStock buyStock = new BuyStock(abcStock);
        SellStock sellStock = new SellStock(abcStock);
        Broker broker = new Broker();
        broker.takeOrder(buyStock);
        broker.takeOrder(sellStock);
        broker.placeOrders();
    }
}
