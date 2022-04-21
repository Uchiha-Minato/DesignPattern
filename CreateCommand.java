package commandPattern;

/**
 * 具体命令 创建命令
 * */
public class CreateCommand implements ICommand{

    BoardScreen screen;//对接收者的引用

    public CreateCommand(BoardScreen screen){
        this.screen = screen;
    }
    @Override
    public void execute(){
        screen.create();
    }
}
