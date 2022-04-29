package mediatorPattern;

/**
 * Abstract Colleague
 * 抽象同事
 * */
public abstract class Country {

    public String name;
    public UnitedNations unitedNations;

    public Country(String name, UnitedNations unitedNations){
        this.name = name;
        this.unitedNations = unitedNations;
        unitedNations.countries.add(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sendMsg(String msg){
        unitedNations.showMsg(this, msg);
    }
}
