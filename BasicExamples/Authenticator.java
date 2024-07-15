import java.util.*;

public class Authenticator {

    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.println("Enter your password: ");
        String s = k.nextLine();
        String password = "12345";

        if (!s.equals(password)) {
            System.out.println("Wrong password. Do you want reset? (Y/N)");
            String sifre = k.nextLine();
            if (sifre.equals("Y")) {
                System.out.println("Enter new password: ");
                String newPassword = k.nextLine();

                while (newPassword.equals(password)) {
                    System.out.println("Password not created, enter new password:");
                    newPassword = k.nextLine();
                }
                System.out.println("Password has been reset. Your new password: " + newPassword);
                
            } else {
                System.out.println("Could not reset password.");
            }
        } else {
            System.out.println("Correct password");
        }
       
    }
}
