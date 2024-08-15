import java.util.Scanner;

public class PalindromNumber {
    static boolean isPalindrome(int number) {
        int reversedNumber = reverse(number);

        if (number == reversedNumber) {
            return true;
        } else {
            return false;
        }
    }

    static int reverse(int number) {
        int reversedNumber = 0;
        while (number != 0) {
            int lastDigit = number % 10;
            reversedNumber = reversedNumber * 10 + lastDigit;
            number /= 10;
        }
        return reversedNumber;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (isPalindrome(number))
            System.out.println(number + " is a palindromic number.");
        else
            System.out.println(number + " is not a palindromic number.");

    }
}
