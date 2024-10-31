package com.pluralsight;

public class Dinosaur {
    private String name;
    private int age;
    private String species;
    private String diet;
    private double weight;

    /**
     * This is a Constructor
     * @param name
     * @param age
     * @param species
     * @param diet
     * @param weight
     */
    public Dinosaur(String name, int age, String species, String diet, double weight){
        this.name = name;
        this.age = age;
        this.species = species;
        this.diet = diet;
        this.weight = weight;
    }

    /**
     * getter for name
     * @return name
     */
    public String getName(){
        return name;
    }

    /**
     * setter for name
     * @param name
     */
    public void setName(String name){
        this.name = name;
    }

    /**
     * getter for age
     * @return age
     */
    public int getAge(){
        return age;
    }

    /**
     * setter for age
     * @param age
     */
    public void setAge(int age){
        this.age = age;
    }

    /**
     * getter for species
     * @return species
     */
    public String getSpecies(){
        return species;
    }

    /**
     * setter for species
     * @param species
     */
    public void setSpecies(String species){
        this.species = species;
    }

    /**
     * getter for diet
     * @return diet
     */
    public String getDiet(){
        return diet;
    }

    /**
     * setter for diet
     * @param diet
     */
    public void setDiet(String  diet){
        this.diet = diet;
    }

    /**
     * getter for weight
     * @return weight
     */
    public double getWeight(){
        return weight;
    }

    /**
     * setter for weight
     * @param weight
     */
    public void setWeight(double weight){
        this.weight = weight;
    }
}
