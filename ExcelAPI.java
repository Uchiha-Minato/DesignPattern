package adapter_Bridge;

/**
 * Adaptee 被适配者：适配器模式
 * */
public class ExcelAPI {
    public void getDataFromExcel(){
        System.out.println("A msg from Excel API:");
        System.out.println("Excel Data collection completed.");
    }
}
