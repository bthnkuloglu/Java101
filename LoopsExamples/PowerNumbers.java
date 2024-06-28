import java.util.Scanner;

public class PowerNumbers {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        int number, power;
        while (true) {
            System.out.print("Enter your number: ");
            number = k.nextInt();
            System.out.print("Enter your power: ");
            power = k.nextInt();
            if (power < 0) {
                System.out.println("Power don't less 0.");
            } else {
                break;
            }
        }
        int result = 1;
        for (int i = 1; i <= power; i++) {
            result *= number;
        }
        System.out.println(number + "^" + power + " = " + result);

    }
}
