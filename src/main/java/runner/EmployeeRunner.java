package runner;

import employee.FullTimeEmployee;
import employee.PartTimeEmployee;
import entity.Employee;

public class EmployeeRunner {

    public static void main(String[] args) {

        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee("John Doe", 12345, 50000.0, 5000.0);
        PartTimeEmployee partTimeEmployee = new PartTimeEmployee("Jane Smith", 67890, 0.0, 20.0, 30);
        Employee[] employees = {fullTimeEmployee, partTimeEmployee};
        fullTimeEmployee.displayInfo(true);
        for (Employee e: employees){
            e.displayInfo();
            System.out.println("Total pay: " + e.calculatePay());
            System.out.println("------------------------");

        }
    }

}
