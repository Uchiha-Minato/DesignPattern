package mediatorPattern;

import java.util.Date;

/**
 * Concrete Mediator
 * 具体中介者
 * */
public class WTO extends UnitedNations{

    @Override
    public void showMsg(Country country, String msg) {
        System.out.println("A msg from WTO");
        System.out.println(new Date() + " [" +
                country.getName() + "]: " + msg + "\n");
    }
}
