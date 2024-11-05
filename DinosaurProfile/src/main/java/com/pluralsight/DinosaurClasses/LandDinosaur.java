package com.pluralsight.DinosaurClasses;

public class LandDinosaur extends Dinosaur{
    private String runSpeed;

    public LandDinosaur(){}

    public LandDinosaur(String runSpeed) {
        this.runSpeed = runSpeed;
    }

    public LandDinosaur(String name, int age, String species, String diet, double weight, String runSpeed) {
        super (name, age, species, diet, weight);
        this.runSpeed = runSpeed;
    }

    public String getRunSpeed() {
        return runSpeed;
    }

    public void setRunSpeed(String runSpeed) {
        this.runSpeed = runSpeed;
    }
}
