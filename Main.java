package main;

import dao.EmployeeDAO;
import model.Employee;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        EmployeeDAO dao = new EmployeeDAO();

        // Define multiple employees to add
        Employee[] employeesToAdd = new Employee[]{

                new Employee("Mohd Zeeshan Khan","Law",60000)
        };

        // Add each employee
        for (Employee emp : employeesToAdd) {
            dao.addEmployee(emp);
        }

        // Fetch all employees
        List<Employee> employees = dao.getAllEmployees();
        for (Employee e : employees) {
            System.out.println(e);
        }
    }
}
