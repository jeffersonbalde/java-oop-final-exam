package polymorphism;

import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);
    static Employee employees[] = new Employee[10];
    static int employeeCount = 0;

    public static void main(String[] args) {
        int choice = menu();

        if (choice == 1) {
            hourlyEmployee();
        }else if(choice == 2) {
            salariedEmployee();
        }else if(choice == 3) {
            commissionEmployee();;
        }else {
            System.out.println("INVALID! ");
        }

        for(int i = 0; i < employeeCount; i++) {
            System.out.println(employees[i]);
        }
    }

    public static int menu() {
        System.out.println("----------------------------------------------------------------");
        System.out.println("                   EMPLOYEE SALARY CALCULATOR                   ");
        System.out.println("----------------------------------------------------------------");
        System.out.println();
        System.out.println("                        1 HOURLY EMPLOYEE                       ");
        System.out.println("                        2 SALARIED EMPLOYEE                     ");
        System.out.println("                        3 COMMISSION EMPLOYEE                   ");
        System.out.println();

        int input;

        System.out.print("ENTER NUMBER: ");
        input = scanner.nextInt();

        return input;
    }

    public static void hourlyEmployee() {
        System.out.println();
        System.out.print("ENTER ID: ");
        int employeeId = scanner.nextInt();
        System.out.print("ENTER FIRST NAME: ");
        String firstName = scanner.next();
        System.out.print("ENTER LAST NAME: ");
        String lastName = scanner.next();
        System.out.print("ENTER HOURS WORKED: ");
        double hoursWorked = scanner.nextDouble();
        System.out.print("ENTER HOURS RATE: ");
        double hoursRate = scanner.nextDouble();

        employees[employeeCount] = new HourlyEmployee(employeeId, firstName, lastName, hoursWorked, hoursRate);
        employeeCount++;
    }

    public static void salariedEmployee() {
        System.out.println();
        System.out.print("ENTER ID: ");
        int employeeId = scanner.nextInt();
        System.out.print("ENTER FIRST NAME: ");
        String firstName = scanner.next();
        System.out.print("ENTER LAST NAME: ");
        String lastName = scanner.next();
        System.out.print("ENTER BASE SALARY: ");
        double baseSalary = scanner.nextDouble();

        employees[employeeCount] = new SalariedEmployee(employeeId, firstName, lastName, baseSalary);
        employeeCount++;
    }

    public static void commissionEmployee() {
        System.out.println();
        System.out.print("ENTER ID: ");
        int employeeId = scanner.nextInt();
        System.out.print("ENTER FIRST NAME: ");
        String firstName = scanner.next();
        System.out.print("ENTER LAST NAME: ");
        String lastName = scanner.next();
        System.out.print("ENTER BASE SALARY: ");
        double baseSalary = scanner.nextDouble();
        System.out.print("ENTER TOTAL SALES: ");
        double totalSales = scanner.nextDouble();
        System.out.print("ENTER COMMISSION RATE: ");
        double commissionRate = scanner.nextDouble();

        employees[employeeCount] = new CommissionEmployee(employeeId, firstName, lastName, baseSalary, totalSales, commissionRate);
        employeeCount++;
    }
}

