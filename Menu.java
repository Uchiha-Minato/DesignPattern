package commandPattern;

/**
 * invoker
 * */
public class Menu {

    ICommand command;//用于存放对具体命令的调用

    public void setCommand(ICommand command){
        this.command = command;
    }

    public void startExecuteCommand(){
        command.execute();//让具体命令执行execute方法
    }
}
