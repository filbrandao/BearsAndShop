package Week_2.BearsAndShop;

public class Bear {

    public int batteries;
    private String name;


    public Bear(int batteries, String name) {

        this.batteries = batteries;
        this.name = name;
    }

    public Bear(int batteries) {
        this.batteries = batteries;
        this.name = "Sem Nome";
    }

    public Bear() {
        this.name = "Vazio";
        this.batteries = 50;
    }

    public void talk() {

    }

    public int getBatteries() {
        return batteries;
    }
}
