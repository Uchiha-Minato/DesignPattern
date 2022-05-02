package adapter_Bridge;

/**
 * Refined Abstraction 细化抽象：桥接模式
 * */
public class ShowAllReport extends ShowReport{

    private final IDataCollection collection2;
    private final IDataCollection collection3;
    protected ShowAllReport(IDataCollection collection1,
                            IDataCollection collection2,
                            IDataCollection collection3) {
        super(collection1);
        this.collection2 = collection2;
        this.collection3 = collection3;
    }

    @Override
    public void showReport() {
        System.out.println("Show All reports:");
        collection.getData();
        collection2.getData();
        collection3.getData();
    }
}
