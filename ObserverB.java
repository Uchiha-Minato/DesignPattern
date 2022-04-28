package observerPattern;

public class ObserverB extends Observer{

    private final StockB stockB;
    public ObserverB(StockB stockB){
        this.stockB = stockB;
        this.stockB.addObserver(this);
    }
    @Override
    public void update(int priceChange) {
        System.out.println("Message ObserverB has received:");
        System.out.println("StockB price has changed for " +
                priceChange + " percents.");
        System.out.println("Now the price of StockB is " + stockB.getPrice());
    }
}
