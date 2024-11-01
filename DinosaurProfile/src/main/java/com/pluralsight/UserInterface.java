package com.pluralsight;

import java.util.ArrayList;

public class UserInterface {
    private ArrayList<Dinosaur> dinosaur;

    public UserInterface(){
        this.dinosaur = DinosaurFileManager.getDinosaur();
    }

    public void displayAllDinosaur(){
        for(Dinosaur dinosaur1 : dinosaur){
            System.out.println("dinosaur1 = " + dinosaur1.toString());
        }
    }

    public void displayAll(){
        System.out.println("Please enter a choice (A to display all dinosaurs): ");
        String userChoice = Console.PromptForString("Your choice: ");

        switch (userChoice){
            case "A":
                displayAllDinosaur();
                break;
            default:
                System.out.println("Invalid choice. Enter 'A' to display all dinosaurs.");
        }
    }
}
