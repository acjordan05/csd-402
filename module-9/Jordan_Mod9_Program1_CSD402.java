/*
Name: Aysa Jordan
Course: CSD402
Module: 9.2
Assignment: Exception Handling & Text I/O
Program 1
*/

import java.util.ArrayList;
import java.util.Scanner;

public class Jordan_Mod9_Program1_CSD402 {

    public static void main(String[] args) {

        ArrayList<String> items = new ArrayList<>();

        // Add at least 10 strings
        items.add("Apple");
        items.add("Banana");
        items.add("Orange");
        items.add("Strawberry");
        items.add("Mango");
        items.add("Peach");
        items.add("Pineapple");
        items.add("Grapes");
        items.add("Blueberry");
        items.add("Watermelon");

        // Print list using for-each loop
        System.out.println("ArrayList contents:");
        for (String item : items) {
            System.out.println(item);
        }

        Scanner input = new Scanner(System.in);

        System.out.println("\nEnter the index of the element you want to see again:");
        int index = input.nextInt();

        try {
            System.out.println("Element: " + items.get(index));
        } 
        catch (IndexOutOfBoundsException e) {
            System.out.println("Exception thrown: Out of Bounds");
        }

        input.close();
    }
}