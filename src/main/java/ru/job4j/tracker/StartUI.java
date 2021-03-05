package ru.job4j.tracker;

import java.time.format.DateTimeFormatter;

public class StartUI {
    public static void main(String[] args) {
        Tracker tracker = new Tracker();
        Item item = new Item();
        Item findItem = tracker.add(item);
        int temp = 5;
        Item findId = tracker.findById(temp);
        System.out.println(findId);
    }
}
