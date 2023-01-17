package Week_2.BearsAndShop;

public class DrunkBear extends Bear {

    private boolean isAwake;

    public DrunkBear(int batteries) {
        super(batteries, "Pooh");
        this.isAwake = true;
    }

    private static void snoring() {
        System.out.println("zzzZZZZzzzZZZZzzZZZZ");
    }

    @Override
    public void talk() {

        if (this.isAwake == true) {
            int sleepProbability = RandomNumber.randomNumber(1, 5);
            if (sleepProbability == 5) {
                snoring();
                this.isAwake = false;
            }
            System.out.println("I love you!");
            this.batteries--;
        }
    }


}
