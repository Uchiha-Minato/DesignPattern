package proxy_Decorator;

/**
 * Abstract Decorator 抽象装饰：装饰模式
 * */
public abstract class Substitute extends Idol{

    protected Idol idol;//保存被装饰者的引用

    public Substitute(Idol idol){
        this.idol = idol;
    }
    @Override
    public abstract void doAct();
}
