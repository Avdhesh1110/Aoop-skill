package Employee_Directory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        EmployeeDirectory directory = new EmployeeDirectory();

        // Adding employees
        directory.addEmployee(new Employee(1, "Alice", "Engineering"));
        directory.addEmployee(new Employee(2, "Bob", "Marketing"));
        directory.addEmployee(new Employee(3, "Charlie", "Engineering"));
        directory.addEmployee(new Employee(4, "David", "HR"));

        // Listing all employees
        System.out.println("All Employees:");
        for (Employee e : directory.listAllEmployees()) {
            System.out.println(e);
        }

        // Retrieve an employee by ID
        System.out.println("\nRetrieve Employee with ID 2:");
        System.out.println(directory.getEmployeeById(2));

        // Get employees by department
        System.out.println("\nEmployees in Engineering:");
        for (Employee e : directory.getEmployeesByDepartment("Engineering")) {
            System.out.println(e);
        }

        // Removing an employee
        directory.removeEmployee(3);
        System.out.println("\nAfter removing Employee with ID 3:");
        for (Employee e : directory.listAllEmployees()) {
            System.out.println(e);
        }
    }
}

