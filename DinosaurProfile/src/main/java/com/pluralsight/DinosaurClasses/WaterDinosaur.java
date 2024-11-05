package com.pluralsight.DinosaurClasses;

public class WaterDinosaur extends Dinosaur{
    private double swimmingDepth;

    public WaterDinosaur(){}

    public WaterDinosaur(double swimmingDepth) {
        this.swimmingDepth = swimmingDepth;
    }

    public WaterDinosaur(String name, int age, String species, String diet, double weight, double swimmingDepth) {
        super (name, age, species, diet, weight);
        this.swimmingDepth = swimmingDepth;
    }

    public double getSwimmingDepth() {
        return swimmingDepth;
    }

    public void setSwimmingDepth(double swimmingDepth) {
        this.swimmingDepth = swimmingDepth;
    }
}
