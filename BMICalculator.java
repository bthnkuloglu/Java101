import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.print("Enter your weight (kg): ");
        double weight = k.nextDouble();
        System.out.print("Enter your height (m): ");
        double height = k.nextDouble();
        double heightInMeters = height / 100;
        double bmi = weight / (heightInMeters * heightInMeters);
        System.out.println("BMI: " + bmi);
        if (bmi < 18.5) {
            System.out.println("Underweight");
        } else if (bmi < 25) {
            System.out.println("Normal");
        } else if (bmi < 30) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }
    }    
}
