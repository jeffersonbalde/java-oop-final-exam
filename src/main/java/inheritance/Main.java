package inheritance;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Account[] accounts = new Account[10];
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
        System.out.println("----------------------------------------------------------------");
        System.out.println("                           ACCOUNT TYPE                         ");
        System.out.println("----------------------------------------------------------------");
        System.out.println();
        System.out.println("                        1 CHECKING ACCOUNT                      ");
        System.out.println("                        2 SAVINGS ACCOUNT                       ");
        System.out.println();

        int choice;

        do {
            System.out.print("ENTER NUMBER: ");
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
        System.out.print("ENTER ACCOUNT NUMBER: ");
        int accountNumber = scanner.nextInt();

        int index = searchAccount(accounts, count, accountNumber);

        if(index >= 0){
            System.out.println();
            System.out.print("ENTER DEPOSIT AMOUNT: ");
            double amount = scanner.nextDouble();

            accounts[index].deposit(amount);
        }else {
            System.out.println("ACCOUNT NOT EXIST");
        }
    }

    public static void doWithdraw(Account accounts [], int count, Scanner scanner) {
        System.out.print("ENTER ACCOUNT NUMBER: ");
        int accountNumber = scanner.nextInt();

        int index = searchAccount(accounts, count, accountNumber);

        if(index >= 0){
            System.out.println();
            System.out.print("ENTER WITHDRAW AMOUNT: ");;
            double amount = scanner.nextDouble();

            accounts[index].withdraw(amount);
        }else {
            System.out.println("ACCOUNT NOT EXIST");
        }
    }

    public static void applyInterest(Account accounts [], int count, Scanner scanner) {
        System.out.print("ENTER ACCOUNT NUMBER: ");
        int accountNumber = scanner.nextInt();

        int index = searchAccount(accounts, count, accountNumber);

        if(index >= 0){
            if(accounts[index] instanceof SavingsAccount) {
                ((SavingsAccount)accounts[index]).applyInterest();
            }
        }else {
            System.out.println("ACCOUNT NOT EXIST");
        }
    }

    public static Account createAccount(Scanner scanner){
        Account account = null;
        int choice = accountMenu(scanner);
        int acccountNumber;

        System.out.println();
        System.out.print("ENTER ACCOUNT NUMBER: ");
        acccountNumber = scanner.nextInt();

        if(choice == 1) {
            System.out.println();
            System.out.print("ENTER TRANSACTION FEE: ");
            double fee = scanner.nextDouble();
            account = new CheckingAccount(acccountNumber, fee);
        }else {
            System.out.println();
            System.out.print("ENTER INTEREST RATE: ");
            double ir = scanner.nextDouble();
            account = new SavingsAccount(acccountNumber, ir);
        }

        return account;
    }

    public static int menu(Scanner scanner) {
        System.out.println();
        System.out.println("----------------------------------------------------------------");
        System.out.println("                    BANK ACCOUNT MANAGEMENT                     ");
        System.out.println("----------------------------------------------------------------");
        System.out.println();

        System.out.println("                    1 CREATE ACCOUNT                            ");
        System.out.println("                    2 DEPOSIT FUNDS                             ");
        System.out.println("                    3 WITHDRAW FUNDS                            ");
        System.out.println("                    4 APPLY INTEREST                            ");
        System.out.println("                    5 DISCONNECT                                ");
        System.out.println();

        int choice;

        do {
            System.out.print("ENTER NUMBER: ");
            choice = scanner.nextInt();
        }while(choice < 1 || choice > 5);

        return choice;
    }
}
