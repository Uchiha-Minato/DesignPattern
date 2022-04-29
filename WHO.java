package mediatorPattern;

import java.util.Date;

public class WHO extends UnitedNations{

    @Override
    public void showMsg(Country country, String msg) {
        System.out.println("A msg from WHO");
        System.out.println(new Date() + " [" +
                country.getName() + "]: " + msg + "\n");
    }
}
