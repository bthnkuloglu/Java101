import java.util.Scanner;

public class NDegerler {
    public static void main(String[] args) {
        // Java ile klavyeden girilen N tane sayma sayısından en büyük ve en küçük
        // sayıları bulan ve bu sayıları ekrana yazan programı yazın.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kaç tane sayı gireceksiniz ?");
        int n = scanner.nextInt();
        int enBuyukSayi = Integer.MIN_VALUE;
        int enKucukSayi = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            System.out.print("Sayı giriniz : ");
            int sayi = scanner.nextInt();
            if (sayi > enBuyukSayi) {
                enBuyukSayi = sayi;
            }
            if (sayi < enKucukSayi) {
                enKucukSayi = sayi;
            }
        }

        System.out.println("En küçük : " + enKucukSayi);
        System.out.println("En büyük : " + enBuyukSayi);
    }
}
