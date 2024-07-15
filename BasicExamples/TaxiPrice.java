import java.util.Scanner;
public class TaxiPrice {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        int minPrice = 20;
        double pricePerKm = 2.20;
        int openPrice = 10;
        System.out.print("Enter the distance: ");
        double distance = k.nextInt();
        double price = openPrice + (distance * pricePerKm);
        if (price < minPrice) {
            price = minPrice;
        }
        System.out.println("Price: " + price + "₺");
    }
}
