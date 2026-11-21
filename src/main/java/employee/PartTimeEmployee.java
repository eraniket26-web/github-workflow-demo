package employee;

import entity.Employee;

public class PartTimeEmployee extends Employee {

    private double hourlyRate;
    private int hoursWorked;

    public PartTimeEmployee(String name, int id, double baseSalary, double hourlyRate, int hoursWorked) {
        super(name, id, baseSalary);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculatePay() {
        return hourlyRate * hoursWorked;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
    }
}
