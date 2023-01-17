package Week_2.BearsAndShop;

public class CrankyBear extends Bear {

    private int song;
    private int halfBattery;

    public CrankyBear(int batteries) {
        super(batteries);
        this.song = 0;
        this.halfBattery = batteries / 2;
    }

    @Override
    public void talk() {
        if (getBatteries() <= this.halfBattery && song >= 1) {
            System.out.println("Low Battery :(");
        } else if (getBatteries() <= this.halfBattery && song < 1) {
            sing();
            this.batteries--;
        } else {
            System.out.println("I love you!");
            this.batteries--;
        }
    }

    public void sing() {
        System.out.println("Lonely, I'm Mr. Lonely, on my ownnnnn!");
        song++;
    }
}
