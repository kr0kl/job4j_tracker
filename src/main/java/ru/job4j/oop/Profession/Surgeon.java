package ru.job4j.oop.Profession;

public class Surgeon extends Doctor {
    private String theDepartment;

    public Surgeon(String name, String surname, String education, String birthday, String company, String theDepartment) {
        super(name, surname, education, birthday, company);
        this.theDepartment=theDepartment;
    }

    public String getTheDepartment(){
        return this.theDepartment;
    }
}
