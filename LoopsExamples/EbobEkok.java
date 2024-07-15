package LoopsExamles;
import java.util.*;
public class EbobEkok {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        int n1,n2; 
        int ebob = 1, ekok;
        System.out.print("1.Sayıyı giriniz:  ");
        n1 = k.nextInt();
        System.out.println();
        System.out.print("2.Sayıyı giriniz:  ");
        n2 = k.nextInt();
        int i = 1;
        while (i <= n1 && i <= n2) {
            if (n1 % i == 0 && n2 % i == 0) {
                ebob = i;
            }
            i++;
        }
        ekok = (n1 * n2) / ebob;
        System.out.println("Ebob: " + ebob);
        System.out.println("Ekok: " + ekok);
    }
}
