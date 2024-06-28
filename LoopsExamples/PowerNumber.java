import java.util.Scanner;
public class PowerNumber {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = k.nextInt();
      
        System.out.println("4'nin Katları");
        for (int i = 1; i <= number; i*=4) {
            System.out.println(i);  
        }
        System.out.println("5'in Katları");
        for (int i = 1; i <= number; i*=5) {
            System.out.println(i);  
        }
    }
}
