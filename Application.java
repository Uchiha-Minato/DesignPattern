package observerPattern;

import java.util.Scanner;

public class Application {

    public static int priceChange = 0;
    public static void main(String[] args) {
        StockA stockA = new StockA();
        StockB stockB = new StockB();

        new ObserverA(stockA);
        new ObserverB(stockB);

        stockA.setPrice(100);
        stockB.setPrice(50);
        System.out.println("模拟股票价格变动\n");
        System.out.println("股票A初始价格为 " + stockA.getPrice() + " 元");
        System.out.println("股票B初始价格为 " + stockB.getPrice() + " 元");

        try{
            Thread.sleep(1500);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        boolean isContinue = true;
        int choose;
        while (isContinue){
            console();
            Scanner scanner = new Scanner(System.in);
            choose = scanner.nextInt();
            switch (choose){
                case 1 -> {
                    System.out.print("股票A价格设置为");
                    priceChange = scanner.nextInt();
                    stockA.setPrice(priceChange);
                    System.out.println("当前股票A的价格为 "+ stockA.getPrice() + " 元\n");
                }
                case 2 -> {
                    System.out.print("股票B价格设置为");
                    priceChange = scanner.nextInt();
                    stockB.setPrice(priceChange);
                    System.out.println("当前股票B的价格为 "+ stockB.getPrice() + " 元\n");
                }
                case 3 -> {
                    System.out.println("股票A历史价格为 \n" + stockA.getPriceHistory());
                    System.out.println("股票B历史价格为 \n" + stockB.getPriceHistory());
                }
                case 4 -> {
                    System.out.println("退出程序");
                    isContinue = false;
                }
                default -> System.out.println("输入错误，请重新输入一个数");
            }
            try{
                Thread.sleep(1500);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
    /**
     * 控制台模拟用户界面
     * */
    private static void console(){
        System.out.println("\n-------------------");
        System.out.println("输入一个选择：");
        System.out.println("1.股票A价格设置\n2.股票B价格设置");
        System.out.println("3.查看两种股票历史价格");
        System.out.println("4.退出程序");
        System.out.println("-------------------\n");
    }
}
