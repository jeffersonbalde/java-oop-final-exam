package encapsulation;
import java.util.Scanner;
public class ATM_Machine {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Account account = new Account();

        System.out.println();
        System.out.println("-------------------------------------------------");
        System.out.println("                  ATM MACHINE                    ");
        System.out.println("-------------------------------------------------");

        String accountNumber = getAccountNumber();
        account.setAccountNumber(accountNumber);

        String acccountPassword = getAccountPassword();
        account.setAccountPassword(acccountPassword);

        System.out.println();
        System.out.println("Account number: " + accountNumber);
        double balances = 50000;
        System.out.println("Available balances " + balances);

        System.out.println();
        System.out.println("-------------------------------------------------");
        System.out.println("                  Enter 1 for Deposit            ");
        System.out.println("                  Enter 2 for Withdraw           ");
        System.out.println("-------------------------------------------------");

        System.out.println();
        System.out.print("Enter here: ");
        int choices = scanner.nextInt();
        while (choices != 1 && choices != 2) {
            System.out.println();
            System.out.println("Invalid input. Please enter valid input");
            choices = scanner.nextInt();
        }
    }

    public static String getAccountPassword() {
        System.out.print("Enter account password: ");
        String accountPassword = scanner.next();
        return accountPassword;
    }

    public static String getAccountNumber() {
        System.out.println();
        System.out.print("Enter account number: ");
        String accountNumber = scanner.next();
        return accountNumber;
    }
}
