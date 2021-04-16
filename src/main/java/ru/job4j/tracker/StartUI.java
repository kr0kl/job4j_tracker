package ru.job4j.tracker;

import java.util.Scanner;

public class StartUI {
    public void init(Scanner scanner, Tracker tracker) {
        boolean run = false;
        while (run) {
            this.showMenu();
            System.out.print("Select: ");
            int select = Integer.valueOf(scanner.nextLine());
            if (select == 0) {
                System.out.println("=== Create a new Item ====");
                System.out.print("Enter name: ");
                String name = scanner.nextLine();
                Item item = new Item(name);
                tracker.add(item);
            } else if (select == 1) {
                Item[] allElements = tracker.findAll();
                for (Item item : allElements) {
                    System.out.println(item);
                }
            } else if (select == 2) {
                System.out.println("Enter id for edit");
                int id = scanner.nextInt();
                System.out.print("Enter new name: ");
                String newName = scanner.nextLine();
                Item newItem = new Item(scanner.nextLine());
                if (tracker.replace(id, newItem)) {
                    System.out.println("Ok. Edit end");
                } else {
                    System.out.println("Error. Edit end");
                }
            } else if (select == 3) {
                System.out.print("Enter id for delete request: ");
                int id = Integer.parseInt(scanner.nextLine());
                if (tracker.delete(id)) {
                    System.out.println("Deleted id: " + id);
                } else {
                    System.out.println("Not delete id: " + id);
                }

            } else if (select == 4) {
                System.out.print("Enter id for find request: ");
                int id = scanner.nextInt();
                Item newItem = new Item(scanner.nextLine());
                Item resultFind = tracker.findById(id);
                if (resultFind != null) {
                    System.out.println("Result find by id: " + resultFind);
                } else {
                    System.out.println("Not found id: " + id);
                }
            } else if (select == 5) {
                System.out.print("Enter name for find: ");
                String newName = scanner.nextLine();
                Item[] resultFind = tracker.findByName(newName);

                if (resultFind == null) {
                    System.out.println("Error. Not found name: ");
                } else {
                    for (int i = 0; i < resultFind.length; i++) {
                        System.out.println(resultFind[i]);
                    }
                }
            } else if (select == 6) {
                run = false;
            }
        }
    }

    private void showMenu() {
        System.out.println("Menu.");
        System.out.println("0. Add new Item");
        System.out.println("1. Show all items");
        System.out.println("2. Edit item");
        System.out.println("3. Delete item");
        System.out.println("4. Find item by Id");
        System.out.println("5. Find items by name");
        System.out.println("6. Exit Program");
        /* добавить остальные пункты меню. */
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Tracker tracker = new Tracker();
        new StartUI().init(scanner, tracker);
    }
}
