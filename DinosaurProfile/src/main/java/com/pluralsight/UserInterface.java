package com.pluralsight;

import java.util.ArrayList;
import java.util.List;

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

    public void processDinosaurBySpecies(){
        String species = Console.PromptForString("Enter species name: ");
        DinosaurFileManager dinosaurFileManager = new DinosaurFileManager();
        List<Dinosaur> dinosaurs = dinosaurFileManager.getDinosaursBySpecies(species);

        if(dinosaur.isEmpty()){
            System.out.println("No dinosaurs found for the species: " + species);
        }else{
            System.out.println("Dinosaurs of species " + species + " :\n");
            for(Dinosaur dinosaur : dinosaurs){
                System.out.println(dinosaur);
            }
        }
        System.out.println();
    }

    public void processDinosaurByDiet(){
        String diet = Console.PromptForString("Enter Dinosaur diet: ");
        DinosaurFileManager dinosaurFileManager = new DinosaurFileManager();
        List<Dinosaur> dinosaurs = dinosaurFileManager.getDinosaurByDiet(diet);

        if(dinosaur.isEmpty()){
            System.out.println("No dinosaurs found for this species: " + diet);
        }else{
            System.out.println("Dinosaurs of diet " + diet + ":\n");
            for(Dinosaur dinosaur : dinosaurs){
                System.out.println(dinosaur);
            }
        }
        System.out.println();
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
                case "B":
                    addDinosaur();
                    break;
                case "C":
                    processDinosaurBySpecies();
                    break;
                case "D":
                    processDinosaurByDiet();
                    break;
                default:
                    System.out.println("Invalid choice. Enter 'A' to display all dinosaurs.");
            }
        }while (!userChoice.equalsIgnoreCase("E"));
    }
}
