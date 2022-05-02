package adapter_Bridge;

/**
 * Refined Abstraction 细化抽象：桥接模式
 * */
public class ShowReportByChoose extends ShowReport{

    int choose;
    protected ShowReportByChoose(IDataCollection collection, int choose) {
        super(collection);
        this.choose = choose;
    }

    @Override
    public void showReport() {
        System.out.println("Show report by choose:" + choose);
        collection.getData();
    }
}
