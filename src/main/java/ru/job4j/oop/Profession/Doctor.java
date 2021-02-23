package ru.job4j.oop.Profession;

public class Doctor extends Profession {
    private String company;

    public Doctor(String name, String surname, String education, String birthday, String company) {
        super(name, surname, education, birthday);
        this.company = company;
    }

    public String getCompany(){
        return this.company;
    }
}
