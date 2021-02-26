package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book b1 = new Book("Том1", 101);
        Book b2 = new Book("Том2", 102);
        Book b3 = new Book("Том3", 103);
        Book b4 = new Book("Clean code", 104);

        Book[]books = new Book[4];

        books[0] = b1;
        books[1] = b2;
        books[2] = b3;
        books[3] = b4;

        for (int i = 0; i < books.length; i++) {
            Book bk = books[i];
            System.out.println(bk.getName() + " - " + bk.getCount());
        }
        System.out.println("change0indexTo3Index");
        Book temp = books[0];
        books[0] = books[3];
        books[3] = temp;

        for (int i = 0; i < books.length; i++) {
            Book bk = books[i];
            System.out.println(bk.getName() + " - " + bk.getCount());
        }
        System.out.println("WhereNameCleanCode");

        for (int i = 0; i < books.length; i++) {
            Book bk = books[i];
            if(bk.getName().equals("Clean code")) {

                System.out.println(bk.getName() + " - " + bk.getCount());
            }
        }
    }
}
