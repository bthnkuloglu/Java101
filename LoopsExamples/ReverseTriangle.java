import java.util.Scanner;

public class ReverseTriangle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // girilen sayıyı basamak olarak alıp tersten yıldız üçgeni
        System.out.println("Bir sayı giriniz");
        int sayi = sc.nextInt();
        for (int i = sayi; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");

            }
            System.out.println();
        }
    }

}
