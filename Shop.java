package Week_2.BearsAndShop;

public class Shop {
    private int bearCounter;
    private String shopName;

    public Shop(String name) {
        this.shopName = name;
        this.bearCounter = 0;
    }

    public Bear createBear() {
        Bear bear;
        bearCounter++;
        if (bearCounter % 2 == 0) {
            bear = new SimpleBear(RandomNumber.randomNumber(1, 10));
            System.out.println("A new Simple Bear has been created at " + shopName);
            return bear;

        }
        if (bearCounter % 5 == 0) {
            bear = new CrankyBear(RandomNumber.randomNumber(1, 10));
            System.out.println("A new Cranky Bear has been created at " + shopName);
            return bear;
        }
        bear = new DrunkBear(RandomNumber.randomNumber(1, 10));
        System.out.println("A new Drunk Bear has been created at " + shopName);
        return bear;
    }

    public int getBearCounter() {

        return bearCounter;
    }

    public boolean compareShop(Shop shop) {
        if (this.getBearCounter() > shop.getBearCounter()) {
            System.out.println("This store wins!" + this.getBearCounter());
            return true;
        }
        System.out.println("The store " + shop.shopName + " wins!");
        return false;
    }

}
