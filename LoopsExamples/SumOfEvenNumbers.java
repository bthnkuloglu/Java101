import java.util.Scanner;

public class SumOfEvenNumbers {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = k.nextInt();
        int sum = 0;
        if (number % 2 == 0) {
            for (int i = 0; i <= number; i++) {
                sum += i;
                System.out.println(sum);
            }
        } else {
            System.out.println("The number is not even");
        }
    }
}
