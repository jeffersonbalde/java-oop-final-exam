package polymorphism;

public class HourlyEmployee extends Employee {

    private double hoursWorked;
    private double hoursRate;

    public HourlyEmployee() {
        super();
    }

    public HourlyEmployee(int employeeId, String firstName, String lastName, double hoursWorked, double hoursRate) {
        super(employeeId, firstName, lastName);
        this.hoursWorked = hoursWorked;
        this.hoursRate = hoursRate;
    }

    public double calculateSalary() {
        double salary = 0;
        double overtime = 0;

        if(hoursWorked > 40) {
            double hours = hoursWorked - 40;
            hoursWorked = 40;
            overtime = hours * (hoursRate * 1.5);
        }

        salary = hoursWorked * hoursRate;
        salary += overtime;

        return salary;
    }

    @Override
    public String toString() {
        return super.toString()  +
                String.format("%-20s %.2f%n", "EMPLOYEE SALARY: ", calculateSalary());
    }

    public double getHoursWorked() {
        return this.hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked =hoursWorked;
    }

    public double getHoursRate() {
        return this.hoursRate;
    }

    public void setHoursRate(double hoursRate) {
        this.hoursRate = hoursRate;
    }
}