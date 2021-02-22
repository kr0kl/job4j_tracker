package ru.job4j.oop.Profession;

public class Surgeon extends Doctor {
    private String theDepartment;

    public Surgeon(String theDepartment) {
        this.theDepartment=theDepartment;
    }

    public String getTheDepartment(){
        return this.theDepartment;
    }
}
