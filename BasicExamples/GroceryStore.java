import java.util.Scanner;

public class GroceryStore {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        double price = 0;
        String [] grocery = {"Pear","Apple","Tomato","Banana","Aubergine"};
        double [] priceList = {2.14,3.67,1.11,0.95,5.00};
        for (int i = 0; i < grocery.length; i++) {
            System.out.print("How many kg " + grocery[i] + " do you want to buy: ");
            int amount = k.nextInt();
            price += amount * priceList[i];
        }
        System.out.println("Total price: " + price);

    }
}
