package encapsulation;

import java.util.Scanner;

public class Main {
    public static void main(String args[]) {

        ATMOperationInterface op = new ATMOperationImplements();
        ATM atm = new ATM();

        Scanner scanner = new Scanner(System.in);
        int atmNumber = 123;
        int atmPin = 1234;

        System.out.println();
        System.out.println("----------------------------------------------------------------");
        System.out.println("                    ATM MACHINE                                 ");
        System.out.println("----------------------------------------------------------------");
        System.out.println();

        System.out.print("ENTER ATM NUMBER: ");
        int inputATMNumber = scanner.nextInt();
        System.out.print("ENTER PIN NUMBER: ");
        int inputPinNumber = scanner.nextInt();

//        while(inputPinNumber == atmNumber) {
//            Syste
//        }

        if((atmNumber == inputATMNumber) && (atmPin == inputPinNumber)){
            System.out.println();
            System.out.println("VALIDATION DONE");

            while(true) {
                System.out.println();
                System.out.println("                        1 BALANCE                                       ");
                System.out.println("                        2 WITHDRAW                                      ");
                System.out.println("                        3 DEPOSIT                                       ");
                System.out.println("                        4 TRANSACTION                                   ");
                System.out.println("                        5 EXIT                                   ");
                System.out.println();

                System.out.print("ENTER NUMBER: ");
                int userInput = scanner.nextInt();

                if(userInput == 1){
                    op.viewBalance();

                }else if(userInput == 2){
                    System.out.println();
                    System.out.print("ENTER AMOUNT: ");
                    double withdrawAmount = scanner.nextDouble();
                    op.withdrawAmount(withdrawAmount);


                }else if(userInput == 3) {
                    System.out.println();
                    System.out.print("ENTER AMOUNT: ");
                    double depositAmount = scanner.nextDouble();
                    op.depositAmount(depositAmount);

                }else if(userInput == 4) {
                    op.viewTransaction();

                }else if(userInput == 5) {
                    System.out.println("Thank you! ");
                    System.exit(0);
                }else {
                    System.out.println("INVALID INPUT! ");
                }
            }

        }else {
            System.out.println("INVALID ACCOUNT");
            System.exit(0);
        }
    }
}
