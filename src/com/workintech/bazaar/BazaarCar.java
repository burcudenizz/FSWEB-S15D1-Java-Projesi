package com.workintech.bazaar;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class BazaarCar {

    static List<String> groceryList = new ArrayList<>();

    public static void consolApp() {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("Enter one value from 0, 1, 2: ");
                int value = Integer.parseInt(scanner.nextLine());

                if (value < 0 || value > 2) {
                    System.out.println("Value should be 0,1 or 2 ");
                }
                if (value == 1) {
                    System.out.print("Enter the names of products that you want to add: ");
                    String items = scanner.nextLine();
                    addItems(items);
                    System.out.println("New list: " + groceryList);

                }
                if (value == 2) {
                    System.out.print("Enter the names of products that you want to remove: ");
                    String items = scanner.nextLine();
                    removeItems(items);
                    System.out.println("New list: " + groceryList);
                }
                if (value == 0) {
                    System.out.println("Ciao !");
                    break;
                }
            } catch (Exception ex) {
                System.out.println("invalid process" + ex.getMessage());
                break;
            }
        }


    }

    public static void addItems(String input) {
        String[] items = input.split(",");
        for (String item : items) {

            if (item != null && !item.isEmpty() && !item.trim().isEmpty()) {
                String formattedItem = item.trim();
                if (!checkItemIsInList(formattedItem)) {
                    groceryList.add(formattedItem.trim());
                } else {
                    System.out.println(formattedItem + " The product has already been in the list.");
                }
            }
        }
        printSorted(groceryList);
    }

    public static void removeItems(String input) {
        String[] items = input.split(", ");

        for (String item : items) {
            if (item != null && !item.isEmpty() && !item.trim().isEmpty()) {
                String formattedItem = item.trim();
                if (checkItemIsInList(item)) {
                    groceryList.remove(item);
                    System.out.println(item + " the product has been removed.");
                    printSorted(groceryList);
                } else {
                    System.out.println(item + " the product could not find in the list.");
                }
            }
        }
        printSorted(groceryList);
    }

    public static boolean checkItemIsInList(String item) {
        return groceryList.contains(item);
    }

    public static void printSorted(List<String> products) {
        Collections.sort(products);
        for (String product : products) {
            System.out.println(product);
        }
    }

}

