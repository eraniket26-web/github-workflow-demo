package employee;

import entity.Employee;

public class FullTimeEmployee extends Employee {

    private double bonus;

    public FullTimeEmployee(String name , int id, double baseSalary, double bonus){
        super(name, id, baseSalary);
        this.bonus = bonus;
    }


    @Override
    public double calculatePay() {
        return getBaseSalary() + bonus;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
    }

    public void displayInfo(boolean showBonus) {
        super.displayInfo();
        if(showBonus){
            System.out.println("Bonus for the employee: " + bonus);
        }
    }
}
