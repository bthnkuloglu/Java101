import java.util.Scanner;

public class RecursivePower {
    static int power(int a, int b) {
        if(b==1){
            return a;
        }
        else if (b == 0) {
            return 1;
        } else {
            return a * power(a, b - 1);

        }

    }

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the base number:");
       int base = sc.nextInt();
       System.out.println("Enter the power:");
       int power = sc.nextInt();


        System.out.println(power(base,power));
    }
}
