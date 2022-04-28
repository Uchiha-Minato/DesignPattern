package observerPattern;

public abstract class Stock {

    private int price;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
        notifyObserver();
    }

    public abstract void addObserver(Observer observer);

    public abstract void notifyObserver();
}
