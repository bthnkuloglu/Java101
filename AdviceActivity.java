import java.util.Scanner;

public class AdviceActivity {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.println("Enter your heat: ");
        int heat = k.nextInt();
        if (heat < 5) {
            System.out.println("You can go skiing.");
        } else if (heat >= 5 && heat < 15) {
            System.out.println("You can go to the cinema.");
        } else if (heat >= 15 && heat < 25) {
            System.out.println("You can go on a picnic.");
        } else {
            System.out.println("You can go swimming.");
        } 
    }
}
