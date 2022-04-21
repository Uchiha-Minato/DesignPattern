package commandPattern;

import java.util.Scanner;

public class Application {

    public static BoardScreen screen = new BoardScreen();

    public static void main(String[] args) {
        Menu menu = new Menu();

        boolean close = true;
        while(close){
            console();
            Scanner scanner = new Scanner(System.in);
            int choose = scanner.nextInt();
            switch (choose){
                case 1->{
                    OpenCommand openCommand = new OpenCommand(screen);
                    menu.setCommand(openCommand);
                    menu.startExecuteCommand();
                }
                case 2->{
                    CreateCommand createCommand = new CreateCommand(screen);
                    menu.setCommand(createCommand);
                    menu.startExecuteCommand();
                }
                case 3->{
                    CopyCommand copyCommand = new CopyCommand(screen);
                    menu.setCommand(copyCommand);
                    menu.startExecuteCommand();
                }
                case 4->{
                    PasteCommand pasteCommand = new PasteCommand(screen);
                    menu.setCommand(pasteCommand);
                    menu.startExecuteCommand();
                }
                case 5->{
                    PrintLogCommand printLogCommand = new PrintLogCommand(screen);
                    menu.setCommand(printLogCommand);
                    menu.startExecuteCommand();
                }
                case 6->{
                    System.out.println("退出系统");
                    close = false;
                }
                default -> System.out.println("输入错误，请重新输入一个数");
            }
            try{
                Thread.sleep(2000);
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
        System.out.println("欢迎使用文本编辑器");
        System.out.println("-------------------");
        System.out.println("1.打开");
        System.out.println("2.新建");
        System.out.println("3.拷贝");
        System.out.println("4.粘贴");
        System.out.println("5.打印当前日志");
        System.out.println("6.退出编辑器");
        System.out.println("-------------------\n");
    }
}
