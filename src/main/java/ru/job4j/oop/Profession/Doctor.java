package ru.job4j.oop.Profession;

public class Doctor extends Profession {
    private String company;

    public Doctor(){

    }

    public Doctor(String company) {
        this.company=company;
    }

    public String getCompany(){
        return this.company;
    }
}
