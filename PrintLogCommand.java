package commandPattern;

public class PrintLogCommand implements ICommand{

    BoardScreen screen;//对接收者的引用

    public PrintLogCommand(BoardScreen screen){
        this.screen = screen;
    }
    @Override
    public void execute() {
        screen.printLog();
    }
}
