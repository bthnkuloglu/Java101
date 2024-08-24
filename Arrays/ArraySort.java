package Arrays;
import java.util.Scanner;
public class ArraySort {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.print("Dizi boyutunu giriniz: ");
        int n = k.nextInt();
        int[] numbers = new int[n];
        System.out.println("Dizi elemanlarını giriniz:");
        for (int i = 0; i < n; i++) {
            System.out.print("Eleman " + (i + 1) + ": ");
            numbers[i] = k.nextInt();
        }
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < numbers.length - 1 - i; j++) {
                if (numbers[j] > numbers[j + 1]) {

                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }

        // Sıralanmış diziyi ekrana yazdırma
        System.out.print("Küçükten büyüğe sıralanmış dizi: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}
