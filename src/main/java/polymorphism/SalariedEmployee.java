package polymorphism;

public class SalariedEmployee extends Employee{

    private double baseSalary;

    public SalariedEmployee() {
        super();
    }

    public SalariedEmployee(int employeeId, String lastName, String firstName, double baseSalary) {
        super(employeeId, firstName, lastName);
        this.baseSalary = baseSalary;
    }

    public double calculateSalary() {
        return baseSalary;
    }

    @Override
    public String toString() {
        return super.toString() +
                String.format("%-20s %.2f%n", "EMPLOYEE SALARY: ", calculateSalary());
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }
}