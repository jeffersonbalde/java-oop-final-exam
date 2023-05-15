package inheritance;

import java.util.Scanner;

public class AccountDriver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Account accounts[] = new Account[10];
        int numofAccounts = 0;

        int choice;

        do {
            choice = menu(scanner);
            System.out.println();

            if(choice == 1) {
                accounts[numofAccounts++] = createAccount(scanner);
            } else if (choice == 2) {
                doDeposit(accounts, numofAccounts, scanner);
            } else if (choice == 3) {
                doWithdraw(accounts, numofAccounts, scanner);
            }else if (choice == 4) {
                applyInterest(accounts, numofAccounts, scanner);
            }else {
                System.out.println("Thank you! ");
            }
        } while(choice != 5);
    }

    public static int accountMenu(Scanner scanner) {
        System.out.println("Select account type");
        System.out.println("1 checking account");
        System.out.println("2 savings account");

        int choice;
        do {
            System.out.println("Enter choice");
            choice = scanner.nextInt();
        }while(choice < 1 || choice > 2);

        return choice;
    }

    public static int searchAccount(Account accounts [], int count, int accountNumber) {
        for(int i = 0; i <count; i++) {
            if(accounts[i].getAccountNumber() == accountNumber) {
                return i;
            }
        }
        return -1;
    }

    public static void doDeposit(Account accounts [], int count, Scanner scanner) {
        System.out.println("Enter account number: ");
        int accountNumber = scanner.nextInt();

        int index = searchAccount(accounts, count, accountNumber);

        if(index >= 0){
            System.out.println("Please enter deposit amount");
            double amount = scanner.nextDouble();

            accounts[index].deposit(amount);
        }else {
            System.out.println("No account exist with acccountnumber " + accountNumber);
        }
    }

    public static void doWithdraw(Account accounts [], int count, Scanner scanner) {
        System.out.println("Enter account number: ");
        int accountNumber = scanner.nextInt();

        int index = searchAccount(accounts, count, accountNumber);

        if(index >= 0){
            System.out.println("Please enter withdraw amount");
            double amount = scanner.nextDouble();

            accounts[index].withdraw(amount);
        }else {
            System.out.println("No account exist with acccountnumber " + accountNumber);
        }
    }

    public static void applyInterest(Account accounts [], int count, Scanner scanner) {
        System.out.println("Enter account number: ");
        int accountNumber = scanner.nextInt();

        int index = searchAccount(accounts, count, accountNumber);

        if(index >= 0){
            if(accounts[index] instanceof SavingsAccount) {
                ((SavingsAccount)accounts[index]).applyInterest();
            }
        }else {
            System.out.println("No account exist with acccountnumber " + accountNumber);
        }
    }

    public static Account createAccount(Scanner scanner){
        Account account = null;
        int choice = accountMenu(scanner);

        int acccountNumber;
        System.out.println("Enter account number: ");
        acccountNumber = scanner.nextInt();

        if(choice == 1) {
            System.out.println("Enter transaction fee");
            double fee = scanner.nextDouble();
            account = new CheckingAccount(acccountNumber, fee);
        }else {
            System.out.println("Please enter interest rate: ");
            double ir = scanner.nextDouble();
            account = new SavingsAccount(acccountNumber, ir);
        }

        return account;
    }

    public static int menu(Scanner scanner) {
        System.out.println("Bank account menu");
        System.out.println("1 createe new account");
        System.out.println("2 deposit funds");
        System.out.println("3 withdraw funds");
        System.out.println("4 apply interest");
        System.out.println("5 quit");

        int choice;

        do {
            System.out.println("Enter choice");
            choice = scanner.nextInt();
        }while(choice < 1 || choice > 5);

        return choice;
    }
}
