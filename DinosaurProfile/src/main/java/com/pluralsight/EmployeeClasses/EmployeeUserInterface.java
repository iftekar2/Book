package com.pluralsight.EmployeeClasses;

import com.pluralsight.Console;
import com.pluralsight.DinosaurClasses.Dinosaur;

import java.util.ArrayList;

public class EmployeeUserInterface {
    private ArrayList<Employee> employees;
    private ArrayList<Dinosaur> dinosaurs = new ArrayList<> ();

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

    public void saveDinosaur(){
        String authKey = Console.PromptForString("Enter your authorization key: ");
        String dinosaurName = Console.PromptForString("Enter Dinosaur name: ");
        int dinosaurAge = Console.PromptForInt("Enter Dinosaur Age: ");
        String dinosaurSpecies = Console.PromptForString("Enter Dinosaur Species: ");
        String dinosaurDiet = Console.PromptForString("Enter Dinosaur Diet: ");
        double dinosaurWeight = Console.PromptForDouble("Enter Dinosaur Weight: ");

        Dinosaur dinosaur = new Dinosaur(dinosaurName, dinosaurAge, dinosaurSpecies, dinosaurDiet, dinosaurWeight);
        this.dinosaurs.add(dinosaur);
        String result = EmployeeFileManager.addDinosaur(dinosaur, authKey);
        System.out.println(result);
    }

    public void display() {
        System.out.println("Please enter a choice: ");
        System.out.println("[A] to Add a Employee: ");
        System.out.println("[R] to Remove a Employee: ");
        System.out.println("[D] to Add a Dinosaur: ");
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
                case "D":
                    saveDinosaur();
                    break;
                default:
                    System.out.println("Invalid choice. Enter 'A' to add an employee.");
            }
        } while (!userChoice.equalsIgnoreCase("E"));
    }
}