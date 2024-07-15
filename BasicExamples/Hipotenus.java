
import java.util.Scanner;
public class Hipotenus {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.println("1. Kenar : ");
        int a = k.nextInt();
        System.out.println("2. Kenar : ");
        int b = k.nextInt();
        double c = Math.sqrt((a * a) + (b * b));
        System.out.println("Hipotenüs : " + c);
    }
}
