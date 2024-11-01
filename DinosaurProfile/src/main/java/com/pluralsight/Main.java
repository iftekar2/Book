package com.pluralsight;

import java.util.Scanner;

public class Main {
    // Main method for running the program
    public static void main(String[] args) {
        DinosaurFileManager generator = new DinosaurFileManager();
        Scanner scanner = new Scanner(System.in);

        // Sample data addition
        generator.addDinosaur("T-Rex", 20, "Tyrannosaurus", "Carnivore", 8000.5);
        generator.addDinosaur("Stegosaurus", 14, "Stegosaurus", "Herbivore", 2500.0);

        // Display profiles
        generator.displayAllProfiles();
    }
}