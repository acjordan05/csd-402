/*
Author: Aysa Jordan
Date: January 17, 2026
Assignment: Module 1.3
This program prompts the user to enter the mass of water in kilograms,
the initial temperature, and the final temperature. It then calculates the energy
required to heat the water using Q = waterMass * (finalTemperature - initialTemperature) * 4184.
 */

import java.util.Scanner;

public class WaterHeatingCalculator {  // <-- everything is inside this class

    public static void main(String[] args) {  // <-- main method starts here
        Scanner scanner = new Scanner(System.in);

        // Prompt user for water mass
        System.out.print("Enter the mass of water in kilograms: ");
        double waterMass = scanner.nextDouble();

        // Prompt user for initial temperature
        System.out.print("Enter the initial temperature of the water (°C): ");
        double initialTemp = scanner.nextDouble();

        // Prompt user for final temperature
        System.out.print("Enter the final temperature of the water (°C): ");
        double finalTemp = scanner.nextDouble();

        // Calculate energy needed (in Joules)
        double energy = waterMass * (finalTemp - initialTemp) * 4184;

        // Display the result
        System.out.println("The energy required to heat the water is: " + energy + " Joules");

        scanner.close();
    }
}