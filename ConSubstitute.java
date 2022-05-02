package proxy_Decorator;

/**
 * Concrete Decorator 具体装饰者：装饰模式
 * */
public class ConSubstitute extends Substitute {

    public ConSubstitute(Idol idol){
        super(idol);
    }
    @Override
    public void doAct() {
        doDecorate();
    }

    private void doDecorate(){
        System.out.println(this.name + "的替身代替他上台表演，观众看不出来");
    }
}
