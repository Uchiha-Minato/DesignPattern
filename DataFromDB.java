package adapter_Bridge;

/**
 * Concrete Implementor 具体实现者：桥接模式
 * */
public class DataFromDB implements IDataCollection{
    @Override
    public void getData() {
        System.out.println("\nA msg from DataFromDB:");
        System.out.println("Attempt to get data from database...");
        System.out.println("database data collection completed.");
    }
}
