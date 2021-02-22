package ru.job4j.oop.Profession;

public class Engineer extends Profession{
    private String company;

    public Engineer(){

    }

    public Engineer(String company) {
        this.company=company;
    }

    public String getCompany(){
        return this.company;
    }
}
