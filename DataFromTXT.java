package adapter_Bridge;

/**
 * Concrete Implementor 具体实现者：桥接模式
 * */
public class DataFromTXT implements IDataCollection{
    @Override
    public void getData() {
        System.out.println("\nA msg from DataFromTXT:");
        System.out.println("Attempt to get data from .txt files...");
        System.out.println("TXT data collection completed.");
    }
}
