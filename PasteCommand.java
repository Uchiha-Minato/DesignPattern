package commandPattern;

/**
 * 具体命令 粘贴
 * */
public class PasteCommand implements ICommand{

    BoardScreen screen;//对接收者的引用

    public PasteCommand(BoardScreen screen){
        this.screen = screen;
    }
    @Override
    public void execute(){
        screen.paste();
    }
}
