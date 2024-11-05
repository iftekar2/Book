package com.pluralsight.DinosaurClasses;


public class AirDinosaur extends Dinosaur {
    private double wingspan;
    private double flightSpeed;

    public AirDinosaur(){}

    public AirDinosaur(double wingspan, double flightSpeed) {
        this.wingspan = wingspan;
        this.flightSpeed = flightSpeed;
    }

    public AirDinosaur(String name, int age, String species, String diet, double weight, double wingspan, double flightSpeed) {
        super (name, age, species, diet, weight);
        this.wingspan = wingspan;
        this.flightSpeed = flightSpeed;
    }

    public double getWingspan() {
        return wingspan;
    }

    public void setWingspan(double wingspan) {
        this.wingspan = wingspan;
    }

    public double getFlightSpeed() {
        return flightSpeed;
    }

    public void setFlightSpeed(double flightSpeed) {
        this.flightSpeed = flightSpeed;
    }
}