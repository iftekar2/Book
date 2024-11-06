package com.pluralsight;

import com.pluralsight.DinosaurClasses.UserInterface;
import com.pluralsight.EmployeeClasses.EmployeeUserInterface;

public class Main {
    public static void main(String[] args) {
        String userChoice = Console.PromptForString("Enter a choice: ");

        if(userChoice.equalsIgnoreCase ("A")){
            UserInterface userInterface = new UserInterface();
            userInterface.displayAll();
        } else if (userChoice.equalsIgnoreCase ("B")) {
            EmployeeUserInterface employeeUserInterface = new EmployeeUserInterface ();
            employeeUserInterface.display ();
        }
    }
}