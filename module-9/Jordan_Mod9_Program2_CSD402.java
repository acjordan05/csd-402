/*
Name: Aysa Jordan
Course: CSD402
Module: 9.2
Assignment: Exception Handling & Text I/O
Program 2
*/

import java.io.*;
import java.util.Random;
import java.util.Scanner;

public class Jordan_Mod9_Program2_CSD402 {

    public static void main(String[] args) {

        File file = new File("data.file");

        try {

            // Create file if it doesn't exist
            if (!file.exists()) {
                file.createNewFile();
            }

            // Write random numbers to file
            FileWriter writer = new FileWriter(file, true);
            Random rand = new Random();

            for (int i = 0; i < 10; i++) {
                int number = rand.nextInt(100);
                writer.write(number + " ");
            }

            writer.close();

            // Read numbers from file
            System.out.println("Numbers in file:");

            Scanner reader = new Scanner(file);

            while (reader.hasNext()) {
                System.out.print(reader.next() + " ");
            }

            reader.close();

        } 
        catch (IOException e) {
            System.out.println("An error occurred.");
        }
    }
}