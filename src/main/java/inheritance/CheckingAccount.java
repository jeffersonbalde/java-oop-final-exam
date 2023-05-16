package inheritance;

public class CheckingAccount extends Account {

    private static double FEE = 2.5;

    public CheckingAccount() {
        super();
    }

    public CheckingAccount(int accountNumber, double fee) {
        super(accountNumber);
        FEE = fee;
    }

    public void deposit(double amount){
        if(amount > 0) {
            balance += amount;
            System.out.println();
            System.out.println("                        DEPOSIT: " + amount + "                 ");

            balance -= FEE;
            System.out.println("                        FEE: " + FEE + "                        ");
            System.out.println("                        BALANCES: " + balance + "               ");
        }else {
            System.out.println("INVALID! AMOUNT TO LOW");
        }
    }

    public void withdraw(double amount){
        if(amount > 0){
            if((amount+FEE) <= balance) {
                System.out.println();
                System.out.println("                        WITHDRAW: " + amount + "                ");
                balance -= amount;
                balance -= FEE;
                System.out.println("                        FEE: " + FEE + "                        ");
                System.out.println("                        BALANCES: " + balance + "               ");
            }
        }else {
            System.out.println("INVALID! AMOUNT TO LOW");
        }
    }
}
