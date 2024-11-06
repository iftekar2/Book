package com.pluralsight.EmployeeClasses;

import com.pluralsight.Console;
import java.util.ArrayList;

public class EmployeeUserInterface {
    private ArrayList<Employee> employees;

    public EmployeeUserInterface() {
        this.employees = new ArrayList<>();
    }

    public void addEmployee() {
        String employeeName = Console.PromptForString("Enter Employee Name: ");
        int employeeNumExperience = Console.PromptForInt("Enter Employee Years of experience: ");
        String employeeJobTitle = Console.PromptForString("Enter Employee Job title: ");

        Employee employee = new Employee(employeeName, employeeNumExperience, employeeJobTitle);
        this.employees.add(employee);
        String result = EmployeeFileManager.saveEmployee(employee);
        System.out.println(result);
    }

    public void deleteEmployee(){
        String employeeName = Console.PromptForString("Enter employee name to remove: ");
        String result = EmployeeFileManager.removeEmployee(employeeName);
        System.out.println(result);
    }

    public void display() {
        System.out.println("Please enter a choice: ");
        String userChoice;

        do {
            userChoice = Console.PromptForString("Your choice: ");
            switch (userChoice) {
                case "A":
                    addEmployee();
                    break;
                case "B":
                    deleteEmployee();
                    break;
                default:
                    System.out.println("Invalid choice. Enter 'A' to add an employee.");
            }
        } while (!userChoice.equalsIgnoreCase("E"));
    }
}