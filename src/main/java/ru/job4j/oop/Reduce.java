package ru.job4j.oop;

public class Reduce {
    private int[] arrayclass;

    public void to(int[] array) {
        arrayclass = array;
    }

    public void print() {
        for (int index = 0; index < arrayclass.length; index++) {
            System.out.println(arrayclass[index]);
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        Reduce reduce = new Reduce();
        reduce.to(array);
        reduce.print();
    }
}
