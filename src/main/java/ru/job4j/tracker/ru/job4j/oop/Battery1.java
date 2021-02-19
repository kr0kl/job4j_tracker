package ru.job4j.tracker.ru.job4j.oop;

public class Battery1 {
    private int load;
    public void exchange(Battery1 another){
        another.load = another.load + this.load;
        this.load = 0;
    }
}
