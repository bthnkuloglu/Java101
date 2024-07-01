import java.util.Scanner;
public class HarmonicMean {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        int n, i;
        double sum = 0;
        System.out.print("Enter your number: ");
        n = k.nextInt();
        for (i = 1; i <= n; i++) {
            sum += 1.0 / i;
        }
        System.out.println("Harmonic mean is: " + sum);
    }   
}
