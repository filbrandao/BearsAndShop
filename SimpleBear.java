package Week_2.BearsAndShop;

public class SimpleBear extends Bear {

    public SimpleBear(int batteries) {
        super(batteries);
    }

    public SimpleBear(int batteries, String name) {
        super(batteries, name);
    }

    public SimpleBear() {
        super();
    }

    @Override
    public void talk() {
        if (getBatteries() == 0) {
            System.out.println("Low Battery :(");
        }
        System.out.println("I love you!");
        this.batteries--;
    }
}
