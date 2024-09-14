import java.util.Scanner;

public class PalindromWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt user for input
        System.out.println("Enter a word:");
        String input = scanner.nextLine();
        
        // Check if the input is a palindrome
        if (isPalindrome(input)) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }
        
        scanner.close();
    }

    // Method to check if a string is a palindrome
    public static boolean isPalindrome(String str) {
        // Remove spaces and convert to lower case for a case-insensitive comparison
        str = str.replaceAll("\\s", "").toLowerCase();
        
        // Get the length of the string
        int length = str.length();
        
        // Compare characters from the start and end moving towards the center
        for (int i = 0; i < length / 2; i++) {
            if (str.charAt(i) != str.charAt(length - i - 1)) {
                return false; // If mismatch is found, it's not a palindrome
            }
        }
        
        return true; // All characters matched, it's a palindrome
    }
}
