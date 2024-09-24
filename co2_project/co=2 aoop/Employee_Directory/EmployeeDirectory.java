package Employee_Directory;

import java.util.*;

public class EmployeeDirectory {
    private Set<Employee> employeeSet;
    private Map<Integer, Employee> employeeMap;

    public EmployeeDirectory() {
        employeeSet = new HashSet<>();
        employeeMap = new HashMap<>();
    }

    // Add an employee to both Set and Map
    public boolean addEmployee(Employee employee) {
        if (employeeSet.add(employee)) {
            employeeMap.put(employee.getId(), employee);
            return true;
        }
        return false; // Employee with the same ID already exists
    }

    // Remove an employee by ID
    public boolean removeEmployee(int id) {
        Employee employee = employeeMap.remove(id);
        if (employee != null) {
            employeeSet.remove(employee);
            return true;
        }
        return false; // Employee with this ID does not exist
    }

    // Retrieve an employee by ID using Map
    public Employee getEmployeeById(int id) {
        return employeeMap.get(id);
    }

    // List all employees (Sorted by ID using TreeSet)
    public Set<Employee> listAllEmployees() {
        return new TreeSet<>(employeeSet); // Automatically sorted by Comparable interface
    }

    // Get all employees in a specific department
    public Set<Employee> getEmployeesByDepartment(String department) {
        Set<Employee> departmentEmployees = new HashSet<>();
        for (Employee employee : employeeSet) {
            if (employee.getDepartment().equalsIgnoreCase(department)) {
                departmentEmployees.add(employee);
            }
        }
        return departmentEmployees;
    }
}

