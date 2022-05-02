package adapter_Bridge;

import java.util.Scanner;

public class Client {

    public static boolean isContinue = true;
    public static void main(String[] args) {
        System.out.println("----报表处理模块-----");
        int choose;

        while (isContinue){
            console();
            Scanner sc = new Scanner(System.in);
            choose = sc.nextInt();
            isContinue = console(choose,isContinue);
        }
        System.out.println("退出程序");
    }

    public static void console(){
        System.out.println("\n请输入一个选择：");
        System.out.println("0.打印所有介质的报表（.txt/DB/Excel）");
        System.out.println("--选择单独打印何处的报表");
        System.out.println("1.打印.txt文件报表\n2.打印数据库报表\n3.打印Excel报表");
        System.out.println("4.退出程序\n");
    }

    public static ShowReport report;
    public static boolean console(int choose, boolean isContinue){
        switch (choose){
            case 0 -> {
                report = new ShowAllReport(new DataFromTXT(),
                        new DataFromDB(), new DataFromExcel());
                report.showReport();
            }
            case 1 -> {
                report = new ShowReportByChoose(new DataFromTXT(), choose);
                report.showReport();
            }
            case 2 -> {
                report = new ShowReportByChoose(new DataFromDB(), choose);
                report.showReport();
            }
            case 3 -> {
                report = new ShowReportByChoose(new DataFromExcel(), choose);
                report.showReport();
            }
            case 4 -> isContinue = false;
        }
        try{
            Thread.sleep(1500);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        return isContinue;
    }
}
