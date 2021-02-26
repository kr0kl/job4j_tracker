package ru.job4j.pojo;

public class College {
    public static void main(String[] args) {
        Student st1 = new Student();
        st1.setName("Petr Arsentev");
        st1.setGroup("Java");
        st1.setDate(2018);

        System.out.println(st1.getName()+":"+st1.getGroup()+"-"+st1.getDate());

    }
}
