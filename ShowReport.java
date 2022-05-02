package adapter_Bridge;

/**
 * Abstraction 抽象
 * */
public abstract class ShowReport {

    protected IDataCollection collection;//含有一个Implementor对象的引用

    protected ShowReport(IDataCollection collection){
        this.collection = collection;
    }
    public abstract void showReport();
}
