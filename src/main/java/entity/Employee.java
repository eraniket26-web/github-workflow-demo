package entity;

public class Employee {

    //name (String), id (int), baseSalary (double)
    private String name;
    private int id;
    private double baseSalary;

    public Employee() { }

    public Employee(String name, int id, double baseSalary) {
        this.name = name;
        this.id = id;
        this.baseSalary = baseSalary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }


    public double calculatePay(){
        return baseSalary;
    }

    public void displayInfo(){
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Base Salary: " + calculatePay());
    }

}
