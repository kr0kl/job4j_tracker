package ru.job4j.oop.Profession;

public class Programmer extends Engineer {
 private String theDepartment;

    public Programmer(String theDepartment) {
        this.theDepartment=theDepartment;
    }

    public String getTheDepartment(){
        return this.theDepartment;
    }
}
