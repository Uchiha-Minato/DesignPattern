package observerPattern;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class StockA extends Stock{

    private final List<Observer> observerA = new ArrayList<>();//购买了股票A的股民
    private final LinkedList<Integer> pricesA = new LinkedList<>();//股票价格变动历史保存数组
    public StockA(){
        price = 100;//将股票A的价格初始化为100元
    }
    @Override
    public void addObserver(Observer observer) {
        observerA.add(observer);
    }

    /**
     * 当价格变化幅度大于5%时，通知用户
     * */
    @Override
    public void notifyObserver() {
        pricesA.addLast(price);
        if (pricesA.size() >= 2){
            float justPrice = pricesA.get(pricesA.size()-2);
            float percent = ((price - justPrice)/justPrice)*100;
            if (Math.abs(percent) >= 5){
                for (Observer observer : observerA){
                    observer.update((int)percent);
                }
            }
        }
    }

    @Override
    public String getPriceHistory() {
        return pricesA.toString();
    }
}
