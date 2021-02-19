package ru.job4j.oop;

public class Fix {
    private String desc;

    public Fix(String text) {
        this.desc = text;
    }

    public static void main(String[] args) {
        String issue = "Fix you ASAP.";
        Fix item = new Fix(issue);
    }
}
