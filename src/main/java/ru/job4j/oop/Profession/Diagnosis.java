package ru.job4j.oop.Profession;

public class Diagnosis extends Doctor{
    private String theDepartment;

    public Diagnosis(String theDepartment) {
        this.theDepartment=theDepartment;
    }

    public String getTheDepartment(){
        return this.theDepartment;
    }
}
