
import java.util.Scanner;

public class FullDivisibility {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = k.nextInt();
        if (number % 3 == 0 && number % 4 == 0) {
            System.out.println("The number is fully divisible by 3 and 4");
        } else {
            System.out.println("The number is not fully divisible by 3 and 4");
        }
    }
}
