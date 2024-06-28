import java.util.Scanner;

public class Combination {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        int n, r;
        int nF = 1;
        int rF = 1;
        int n_rF = 1;
        int c = 0;
        while (true) {
            System.out.print("Lütfen n değerini girin: ");
            n = k.nextInt();
            System.out.print("Lütfen r değerini girin: ");
            r = k.nextInt();
            if (r <= n) {
                break;
            } else {
                System.out.println("r değeri n değerinden büyük olamaz. Lütfen tekrar deneyin.");
            }
        }
            for (int i = 1; i <= n; i++) {
                nF *= i;
            }
            for (int i = 1; i <= r; i++) {
                rF *= i;
            }
            for (int i = 1; i <= n - r; i++) {
                n_rF *= i;
            }
            c = nF / (rF * n_rF);
            System.out.println("C(" + n + "," + r + ") = " + c);
    }
}

