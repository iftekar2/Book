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

    public void addDinosaur(){
        String name = Console.PromptForString("Enter dinosaur name: ");
        int age = Console.PromptForInt("Enter dinosaur age: ");
        String species = Console.PromptForString("Enter dinosaur species: ");
        String diet = Console.PromptForString("Enter dinosaur diet: ");
        double weight = Console.PromptForDouble("Enter dinosaur weight: ");

        Dinosaur dinosaur = new Dinosaur(name, age, species, diet, weight);
        this.dinosaur.add(dinosaur);
        String result = DinosaurFileManager.saveDinosaur(dinosaur);
        System.out.println(result);
    }

    public void displayAll(){
        System.out.println("Please enter a choice (A to display all dinosaurs): ");
        String userChoice;

        do{
            userChoice = Console.PromptForString("Your choice: ");
            switch (userChoice){
                case "A":
                    displayAllDinosaur();
                    break;
                case "N":
                    addDinosaur();
                    break;
                default:
                    System.out.println("Invalid choice. Enter 'A' to display all dinosaurs.");
            }
        }while (!userChoice.equalsIgnoreCase("E"));

    }
}
