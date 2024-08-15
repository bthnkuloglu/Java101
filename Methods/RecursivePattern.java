/*
 * Girilen sayı 0 veya negatif olduğu yere kadar girilen sayıdan 5 rakamını çıkarın. Her çıkarma işlemi sırasında ekrana son değeri yazdırın. Sayı negatif veya 0 olduktan sonra tekrar 5 ekleyin. Yine her ekleme işleminde sayının son değerini ekrana yazdırın.
 */
import java.util.Scanner;
public class RecursivePattern{
    static void pattern(int a){
        if(a<=0){
            System.out.println(a);
            a+=5;
            System.out.println(a);
            return;
            }
            System.out.println(a);
            pattern(a-5);
            
    
    } 


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bir sayı giriniz:");
        int sayi = sc.nextInt();
        pattern(sayi);
        
    }
}