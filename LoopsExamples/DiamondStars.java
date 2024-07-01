import java.util.Scanner;
public class DiamondStars {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        int n, i, j, space;
        System.out.print("Enter your number: ");
        n = k.nextInt();
        space = n - 1;
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            space--;
            for (j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

