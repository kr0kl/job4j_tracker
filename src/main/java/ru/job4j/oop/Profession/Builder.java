package ru.job4j.oop.Profession;

public class Builder extends Engineer{
    private String theDepartment;

    public Builder(String theDepartment) {
        this.theDepartment=theDepartment;
    }

    public String getTheDepartment(){
        return this.theDepartment;
    }
}
