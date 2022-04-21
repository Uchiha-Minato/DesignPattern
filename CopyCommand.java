package commandPattern;

/**
 * 具体命令 拷贝
 * */
public class CopyCommand implements ICommand {

    BoardScreen screen;//对接收者的引用

    public CopyCommand(BoardScreen screen){
        this.screen = screen;
    }
    @Override
    public void execute(){
        screen.copy();
    }
}
