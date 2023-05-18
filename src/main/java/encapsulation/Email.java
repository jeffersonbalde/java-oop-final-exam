package encapsulation;

import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private String email;
    private String mailboxCapacity;
    private String alternateEmail;
    private String companySuffix = "edu";
    private int defaultPasswordLength = 10;

    public Email(String firstName, String lastName) {
        setFirstName(firstName);
        setLastName(lastName);

//        set the department
        this.department = setDepartment();


//        set the password
        this.password = randomPassword(defaultPasswordLength);

//        combine
        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix + ".ph";
    }

    private String setDepartment() {
        System.out.println();
        System.out.println("----------------------------------------------------------------");
        System.out.println("                        SELECT DEPARTMENT                       ");
        System.out.println("----------------------------------------------------------------");
        System.out.println();

        System.out.println("                        1 FOR EDUCATION                             ");
        System.out.println("                        2 FOR DEVELOPMENT                       ");
        System.out.println("                        3 FOR ACCOUNTING                        ");
        System.out.println();

        System.out.print("ENTER NUMBER: ");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        if(choice == 1) {return "sccpag";}
        else if(choice == 2) {return "dev";}
        else if(choice == 3) {return "acct";}
        else return "";
    }

    private String randomPassword(int length) {
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!@#$%^&*";

        char[] password = new char[length];

        for(int i = 0; i < length; i++){
            int random = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(random);
        }

        return new String(password);
    }

    public String showInfo() {
        return " NAME: " + firstName + " " + lastName +
                "\n EMAIL: " + email +
                "\n PASSWORD: " + password ;
    }

    public void setMailboxCapacity(String mailboxCapacity) {
        this.mailboxCapacity = mailboxCapacity;
    }

    public void setAlternateEmail(String alternateEmail) {
        this.alternateEmail = alternateEmail;
    }

    public void changePassword(String password) {
        this.password = password;
    }

    public String getMailboxCapacity() {
        return mailboxCapacity;
    }

    public String getAlternateEmail() {
        return alternateEmail;
    }



    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }


    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
