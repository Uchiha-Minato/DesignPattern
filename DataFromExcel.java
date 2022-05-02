package adapter_Bridge;

/**
 * Concrete Implementor 具体实现者：桥接模式
 * Adapter 适配器：适配器模式
 * */
public class DataFromExcel implements IDataCollection{

    private final ExcelAPI api = new ExcelAPI();//包含对被适配者的引用

    @Override
    public void getData() {
        System.out.println("\nA msg from DataFromExcel:");
        System.out.println("Attempt to get data from Excel...");
        api.getDataFromExcel();
    }
}
