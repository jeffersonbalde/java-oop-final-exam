package inheritance;

public class SavingsAccount extends Account{
    private double interestRate;

    public SavingsAccount() {
        super();
    }

    public SavingsAccount(int accountNumber, double interestRate) {
        super(accountNumber);
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return this.interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public double calcInterest() {
        return balance * interestRate;
    }

    public void applyInterest() {
        double interest = calcInterest();
        System.out.println();
            System.out.println("                        INTEREST: " + interest + "              ");
        deposit(interest);
    }

    public void deposit(double amount){
        if(amount > 0) {
            balance += amount;
            System.out.println();
            System.out.println("                        DEPOSIT: " + amount + "                ");
            System.out.println("                        BALANCE: " + balance + "               ");
        }else {
            System.out.println("INVALID! AMOUNT TO LOW");
        }
    }

    public void withdraw(double amount){
        if(amount > 0){
            if((amount) <= balance) {
                balance -= amount;
                System.out.println();
                System.out.println("                        WITHDRAWN: " + amount + "              ");
                System.out.println("                        BALANCE: " + balance + "               ");
            }
        }else {
            System.out.println("INVALID! AMOUNT TO LOW");
        }
    }
}
