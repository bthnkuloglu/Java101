import java.util.Scanner;
public class CircleCalculator {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        int r = k.nextInt();
        double pi = 3.14;
        double area = pi * r * r;
        double perimeter = 2 * pi * r;
        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);

    }
}
