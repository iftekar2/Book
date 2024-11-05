package com.pluralsight.DinosaurClasses;


public class AirDinosaur extends Dinosaur {
    private double wingspan;
    private double flySpeed;

    public AirDinosaur(){}

    public AirDinosaur(double wingspan, double flySpeed) {
        this.wingspan = wingspan;
        this.flySpeed = flySpeed;
    }

    public AirDinosaur(String name, int age, String species, String diet, double weight, double wingspan, double flySpeed) {
        super (name, age, species, diet, weight);
        this.wingspan = wingspan;
        this.flySpeed = flySpeed;
    }

    public double getWingspan() {
        return wingspan;
    }

    public void setWingspan(double wingspan) {
        this.wingspan = wingspan;
    }

    public double getFlySpeed() {
        return flySpeed;
    }

    public void setFlySpeed(double flySpeed) {
        this.flySpeed = flySpeed;
    }
}