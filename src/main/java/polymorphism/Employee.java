package polymorphism;

public abstract class Employee {
    private int employeeId;
    private String firstName;
    private String lastName;

    public Employee() {}

    public Employee(int employeeId, String firstName, String lastName) {
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public abstract double calculateSalary();

    @Override
    public String toString() {
        System.out.println();
        return String.format("%-20s %d%n", "EMPLOYEE ID:", employeeId) +
                String.format("%-20s %s%n", "EMPLOYEE NAME:", firstName + " " + lastName);
    }
}