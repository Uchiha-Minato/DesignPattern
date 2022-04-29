package mediatorPattern;

import java.util.ArrayList;

/**
 * Abstract Mediator
 * 抽象中介者
 * */
public abstract class UnitedNations {

    public ArrayList<Country> countries = new ArrayList<>();

    public abstract void showMsg(Country country, String msg);


}
