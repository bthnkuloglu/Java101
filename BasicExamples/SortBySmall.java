import java.util.Scanner;
public class SortBySmall {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        int a,b,c; 
        System.out.print("Enter the first number: ");
        a = k.nextInt();
        System.out.print("Enter the second number: ");
        b = k.nextInt();
        System.out.print("Enter your third number: ");
        c = k.nextInt();
        if (a < b && a < c) {
            if (b < c) {
                System.out.println(a + " " + b + " " + c);
            } else {
                System.out.println(a + " " + c + " " + b);
            }
        } else if (b < a && b < c) {
            if (a < c) {
                System.out.println(b + " " + a + " " + c);
            } else {
                System.out.println(b + " " + c + " " + a);
            }
        } else {
            if (a < b) {
                System.out.println(c + " " + a + " " + b);
            } else {
                System.out.println(c + " " + b + " " + a);
            }
        }
    }
}
