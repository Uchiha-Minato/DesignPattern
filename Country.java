package mediatorPattern;

public abstract class Country {

    public String name;
    public UnitedNations unitedNations;

    public Country(String name, UnitedNations unitedNations){
        this.name = name;
        this.unitedNations = unitedNations;
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
