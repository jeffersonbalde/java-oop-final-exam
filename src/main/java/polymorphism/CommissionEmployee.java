package polymorphism;

public class CommissionEmployee extends Employee {

    private double baseSalary;
    private double totalSales;
    private double commissionRate;

    public CommissionEmployee() {
        super();
    }

    public CommissionEmployee(int employeeId, String firstName, String lastName, double baseSalary, double totalSales, double commissionRate) {
        super(employeeId, firstName, lastName);
        this.baseSalary = baseSalary;
        this.totalSales = totalSales;
        this.commissionRate = commissionRate;
    }

    public double getBaseSalary() {
        return this.baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public double getTotalSales() {
        return totalSales;
    }

    public void setTotalSales(double totalSales) {
        this.totalSales = totalSales;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }

    public double calculateSalary() {
        return calculateCommission() + baseSalary;
    }

    public double calculateCommission() {
        return totalSales * commissionRate;
    }

    @Override
    public String toString() {
        return super.toString() +
                String.format("%-20s %.2f%n", "EMPLOYEE SALARY: ", calculateSalary());
    }
}
