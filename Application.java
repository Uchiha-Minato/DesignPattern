package mediatorPattern;

public class Application {
    public static void main(String[] args) {

        WTO wto = new WTO();
        WHO who = new WHO();

        China china = new China("China", wto);
        China taiwan = new China("", who);
        Russia russia = new Russia("Russia", wto);
        UnitedKingdom uk = new UnitedKingdom("UnitedKingdom", who);
        UnitedStates usa = new UnitedStates("USA", who);
        taiwan.setName("TaiwanProvince");

        china.sendMsg("牛逼");
        russia.sendMsg("乌拉");
        uk.sendMsg("大本钟下寄快递");
        usa.sendMsg("上面开摆下面寄");
        taiwan.sendMsg("你俩好机车喔");

        System.out.println("WTO与会成员国/地区: ");
        for (Country country : wto.countries){
            System.out.print(country.getName() + "\t");
        }
        System.out.println("\nWHO与会成员国/地区: ");
        for (Country country : who.countries){
            System.out.print(country.getName() + "\t");
        }
    }
}
