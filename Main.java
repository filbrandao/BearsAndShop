package Week_2.BearsAndShop;

public class Main {

    public static void main(String[] args) {

        Shop shop1 = new Shop("Shop 1");
        Shop shop2 = new Shop("Shop 2");
        Shop shop3 = new Shop("Shop 3");

        Bear[] bears = new Bear[5];

        for (int i = 0; i < 5; i++) {
            bears[i] = shop1.createBear();
        }

        bears[0].talk();
        bears[0].talk();
        bears[0].talk();
        bears[0].talk();
        bears[0].talk();

        shop1.compareShop(shop2);
        shop2.compareShop(shop3);


    }

}
