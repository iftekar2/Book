package com.pluralsight;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

public class DinosaurFileManager {
    private static String fileName = "inventory.csv";

    public static ArrayList<Dinosaur> getDinosaur(){
        ArrayList<Dinosaur> dinosaurs = new ArrayList<>();

        try{
            BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));

            String line;
            boolean firstLine = true;

            while((line = bufferedReader.readLine()) != null){
                if(firstLine){
                    firstLine = false;
                    continue;
                }

                String[] newLine = line.split("\\|");

                if(newLine.length == 5){
                    String name = newLine[0];
                    int age = Integer.parseInt(newLine[0]);
                    String species = newLine[2];
                    String diet = newLine[3];
                    double weight = Double.parseDouble(newLine[4]);

                    dinosaurs.add(new Dinosaur(name, age, species, diet, weight));
                }
            }
            bufferedReader.close();
        }catch (Exception e){
            e.printStackTrace();
        }
        return dinosaurs;
    }

    public static String saveDinosaur(Dinosaur dinosaur){
        if(dinosaur == null){
            return "Dinosaur is null";
        }else{
            try{
                BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName, true));

                String dinosaurData = String.format("%s|%d|%s|%s|%.2f\n", dinosaur.getName(), dinosaur.getAge(), dinosaur.getSpecies(), dinosaur.getDiet(), dinosaur.getWeight());
                bufferedWriter.write(dinosaurData);

                return "Dinosaur Saved Successfully";
            }catch (Exception e){
                e.printStackTrace();
                return "Error saving Dinosaur";
            }
        }
    }
}