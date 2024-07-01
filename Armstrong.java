import java.util.Scanner;
public class Armstrong {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        int n, temp, sum = 0, remainder;
        System.out.print("Enter your number: ");
        n = k.nextInt();
        temp = n;
        while (temp != 0) {
            remainder = temp % 10;
            sum += remainder * remainder * remainder;
            temp /= 10;
        }
        if (sum == n) {
            System.out.println(n + " \n" + "is an Armstrong number.");
        } else {
            System.out.println(n + " \n" + "is not an Armstrong number");
        }

    }
}
