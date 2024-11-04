package com.pluralsight;

public class Employee {
    private String name;
    private int yearOfExperience;
    private String jobTitle;

    public Employee(String name, int yearOfExperience, String jobTitle) {
        this.name = name;
        this.yearOfExperience = yearOfExperience;
        this.jobTitle = jobTitle;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearOfExperience() {
        return yearOfExperience;
    }

    public void setYearOfExperience(int yearOfExperience) {
        this.yearOfExperience = yearOfExperience;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", yearOfExperience=" + yearOfExperience +
                ", jobTitle='" + jobTitle + '\'' +
                '}';
    }
}
