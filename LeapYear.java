import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = k.nextInt();
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0)
                    System.out.print(year + " is a leap year.");
                else
                    System.out.print(year + " is not a leap year.");
            } else
                System.out.print(year + " is a leap year.");
        } else
            System.out.print(year + " is not a leap year.");

    }
}
