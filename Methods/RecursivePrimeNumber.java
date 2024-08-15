import java.util.Scanner;

public class RecursivePrimeNumber {
    static int prime(int a) {
    //Recursive asal sayı hesabı yapan metot
    if (a == 1) {
        return 0;
        } else if (a == 2) {
            return 1;
            } else if (a % 2 == 0) {
                return 0;
                } else {
                    return prime(a - 1);

    }
    }
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = input.nextInt();
        int result = prime(number);
        if (result == 1) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }
}