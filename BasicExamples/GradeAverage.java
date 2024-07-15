
import java.util.Scanner;
public class GradeAverage {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        int mat, fizik, turkce,kimya,tarih,muzik;
        System.out.print("Matematik Notunuz: ");
        mat = k.nextInt();
        System.out.print("Fizik Notunuz: ");
        fizik = k.nextInt();
        System.out.print("Türkçe Notunuz: ");
        turkce = k.nextInt();
        System.out.print("Kimya Notunuz: ");
        kimya = k.nextInt();
        System.out.print("Tarih Notunuz: ");
        tarih = k.nextInt();
        System.out.print("Müzik Notunuz: ");
        muzik = k.nextInt();
        int ort = (mat+fizik+turkce+kimya+tarih+muzik)/6;
        System.out.println("Ortalamanız: " + ort);
        String sonuc = ort >= 60 ? "Sınıfı Geçtiniz" : "Sınıfta Kaldınız";
        System.out.println(sonuc);
        

    
    }
}