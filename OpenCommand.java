package commandPattern;

/**
 * 具体命令 打开命令
 * */
public class OpenCommand implements ICommand{

    BoardScreen screen;//对接收者的引用

    public OpenCommand(BoardScreen screen){
        this.screen = screen;
    }

    @Override
    public void execute(){
        screen.open();
    }
}
