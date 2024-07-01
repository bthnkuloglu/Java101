import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        int right = 3 ; 
        int balance = 5000;
        int id, pin;
        System.out.println("Enter your ID: ");
        id = k.nextInt();
        System.out.println("Enter your PIN: ");
        pin = k.nextInt();
        switch (id) {
            case 4141:
                switch (pin) {
                    case 9128:
                        System.out.println("Welcome to the ATM");
                        break;
                    default:
                        System.out.println("Wrong PIN");
                        right--;
                        break;
                }
                break;
            default:
                System.out.println("Wrong ID");
                right--;
                break;
        }
        if (right == 0) {
                System.out.println("Your account is blocked");
    }
    else {
        int choice;
        do {
            System.out.println("1. Withdraw Money");
            System.out.println("2. Deposit Money");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.println("Enter your choice: ");
            choice = k.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter the amount you want to withdraw: ");
                    int amount = k.nextInt();
                    if (amount > balance) {
                        System.out.println("Insufficient balance");
                    } else {
                        balance -= amount;
                        System.out.println("Your new balance is: " + balance);
                    }
                    break;
                case 2:
                    System.out.println("Enter the amount you want to deposit: ");
                    int deposit = k.nextInt();
                    balance += deposit;
                    System.out.println("Your new balance is: " + balance);
                    break;
                case 3:
                    System.out.println("Your balance is: " + balance);
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        } while (choice != 4);
    }
    }
}
