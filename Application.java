package mediatorPattern;

public class Application {
    public static void main(String[] args) {

        WTO wto = new WTO();
        WHO who = new WHO();

        China china = new China("China", wto);
        Russia russia = new Russia("Russia", wto);
        UnitedKingdom uk = new UnitedKingdom("UnitedKingdom", who);

        china.sendMsg("牛逼");
        russia.sendMsg("乌拉");
        uk.sendMsg("寄");
    }
}
