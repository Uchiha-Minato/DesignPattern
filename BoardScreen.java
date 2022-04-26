package commandPattern;

import java.io.*;

public class BoardScreen {

    private static final File FILE = new File("E:\\Files\\2022spring\\DesignPatternEXP\\EXP1\\log.txt");

    public void open(){
        String str = "打开文本编辑器";
        System.out.println(str);
        writeIntoLog(str);
    }
    public void create(){
        String str = "新建文本文档";
        System.out.println(str);
        writeIntoLog(str);
    }
    public void copy(){
        String str = "复制文档";
        System.out.println(str);
        writeIntoLog(str);
    }
    public void paste(){
        String str = "粘贴文档";
        System.out.println(str);
        writeIntoLog(str);
    }

    public void printLog(){
        System.out.println("打印当前日志");
        try{
            FileReader fr = new FileReader("E:\\Files\\2022spring\\DesignPatternEXP\\EXP1\\log.txt");
            BufferedReader br = new BufferedReader(fr);

            String str;
            while((str = br.readLine()) != null){
                System.out.println(str);
            }

        }catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 写入日志
     * */
    private static void writeIntoLog(String msg){
        try{
            FileWriter writer = new FileWriter(FILE, true);
            writer.write(msg + "\n");
            writer.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }


}
