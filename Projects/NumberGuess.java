import java.util.*;

public class NumberGuess {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        int number = (int) (Math.random() * 100);
        System.out.println("Guess a number between 1 and 100");
        int guess = k.nextInt();
        int count = 0;
        while (guess != number) {
            if (guess < number) {
                System.out.println("Too low!");
            } else {
                System.out.println("Too high!");
            }
            guess = k.nextInt();
            count++;
        }
        System.out.println("You got it! The number was " + number + ". It took you " + count + " guesses.");
    }

}
