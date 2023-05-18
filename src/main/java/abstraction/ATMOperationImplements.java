package abstraction;

import java.util.HashMap;
import java.util.Map;

public class ATMOperationImplements implements ATMOperationInterface{

    Map<String, Double> transaction = new HashMap<>();

    ATM atm = new ATM();

    @Override
    public void viewBalance() {
        System.out.println();
        System.out.println("                        BALANCE: " + atm.getBalance() + "                   ");
    }

    @Override
    public void withdrawAmount(double withdrawAmount) {
        if(withdrawAmount <= atm.getBalance()) {
            System.out.println();
            transaction.put("                        WITHDRAW: ", withdrawAmount);
            System.out.println("                        WITHDRAW: " + withdrawAmount + "                   ");
            atm.setBalance(atm.getBalance() - withdrawAmount);
            viewBalance();
        }else {
            System.out.println();
            System.out.println("INSUFFICIENT BALANCES! ");
        }
    }

    @Override
    public void depositAmount(double depositAmount) {
        System.out.println();
        transaction.put("                        DEPOSIT: ", depositAmount);
        System.out.println("                        DEPOSIT: " + depositAmount + "                   ");
        atm.setBalance(atm.getBalance() + depositAmount);
        viewBalance();
    }

    @Override
    public void viewTransaction() {
        for(Map.Entry<String, Double> m:transaction.entrySet()){
            System.out.println(m.getKey()+m.getValue());
        }
    }
}
