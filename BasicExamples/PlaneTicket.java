import java.util.Scanner;

public class PlaneTicket {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        double distPrice = 0.1;
        double price = 0;
        System.out.print("Enter the distance of the flight in km: ");
        double distance = k.nextDouble();
        System.out.print("Enter your age: ");
        int age = k.nextInt();
        // yolcukluk tipini tek yön ya da gidiş dönüş seçilecek. Gidiş dönüş seçilirse
        // eğer %20 indirim uygulanacak
        System.out.print("Enter the type of the ticket (one-way or round-trip): ");
        int ticketType = k.nextInt();
        if (distance <= 0 || age <= 0 || (ticketType != 1 && ticketType != 2)) {
            System.out.println("Hatalı Veri Girdiniz!");
            return;
        }
        price = distance * distPrice;

        // Yaş indirimleri
        if (age < 12) {
            price *= 0.50;
        } else if (age >= 12 && age <= 24) {
            price *= 0.90;
        } else if (age > 65) {
            price *= 0.70;
        }

        // Gidiş-Dönüş indirimi
        if (ticketType == 2) {
            price *= 0.80;
        }

        System.out.printf("Bilet fiyatınız: %.2f TL\n", price);
    

    }
}
