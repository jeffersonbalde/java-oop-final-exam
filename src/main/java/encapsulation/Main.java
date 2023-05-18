package encapsulation;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println();
        System.out.println("----------------------------------------------------------------");
        System.out.println("                   EMAIL GENERATOR                              ");
        System.out.println("----------------------------------------------------------------");
        System.out.println();

        System.out.print("ENTER FIRST NAME: ");
        String firstName = scanner.next();

        System.out.print("ENTER LAST NAME: ");
        String lastName = scanner.next();

        Email email = new Email(firstName, lastName);

        System.out.println();
        System.out.println(email.showInfo());
    }
}
