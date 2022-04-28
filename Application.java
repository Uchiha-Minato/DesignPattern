package observerPattern;

public class Application {
    public static void main(String[] args) {
        StockA stockA = new StockA();
        StockB stockB = new StockB();

        new ObserverA(stockA);
        new ObserverB(stockB);

        stockA.setPrice(5);
        stockB.setPrice(10);
    }
}
