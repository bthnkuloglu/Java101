import java.util.Scanner;

public class VatCalculator {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.println("Money : ");
        double money = k.nextInt();
        double vat = money > 1000 ? money * 0.08 : money * 0.18;
        double total = money + vat;
        System.out.println("VAT : " + vat);
        System.out.println("Total : " + total);
    }
}