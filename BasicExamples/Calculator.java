import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        int n1,n2,select;
        Scanner k = new Scanner(System.in);
        System.out.print("İlk sayıyı giriniz : ");
        n1 = k.nextInt();
        System.out.print("İkinci sayıyı giriniz : ");
        n2 = k.nextInt();
        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.print("Seçiminizi yapınız : ");
        select = k.nextInt();
        switch(select){
            case 1:
                System.out.println("Toplam : " + (n1+n2));
                break;
            case 2:
                System.out.println("Fark : " + (n1-n2));
                break;
            case 3:
                System.out.println("Çarpım : " + (n1*n2));
                break;
            case 4:
                if(n2 != 0){
                    System.out.println("Bölüm : " + (n1/n2));
                }else{
                    System.out.println("Bir sayı 0'a bölünemez.");
                }
                break;
            default:
                System.out.println("Yanlış seçim yaptınız.");
        }

    }
}