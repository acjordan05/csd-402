/**
 * Jordan_Module4.java
 * CSD 340 Module 4 Assignment
 * This program demonstrates four overloaded methods that calculate
 * the average of arrays of different primitive types: short, int, long, double.
 * Each method returns the average of the array passed to it.
 * The test program displays the original array and the computed average.
 */

import java.util.Arrays;

public class Jordan_Module4 {

    // Method to calculate average of short array
    public static short average(short[] array) {
        int sum = 0;
        for (short num : array) {
            sum += num;
        }
        return (short)(sum / array.length);
    }

    // Method to calculate average of int array
    public static int average(int[] array) {
        long sum = 0;
        for (int num : array) {
            sum += num;
        }
        return (int)(sum / array.length);
    }

    // Method to calculate average of long array
    public static long average(long[] array) {
        long sum = 0;
        for (long num : array) {
            sum += num;
        }
        return sum / array.length;
    }

    // Method to calculate average of double array
    public static double average(double[] array) {
        double sum = 0;
        for (double num : array) {
            sum += num;
        }
        return sum / array.length;
    }

    // Test program
    public static void main(String[] args) {

        // Short array of size 3
        short[] shortArr = {10, 20, 30};
        System.out.println("Short Array: " + Arrays.toString(shortArr));
        System.out.println("Average: " + average(shortArr) + "\n");

        // Int array of size 4
        int[] intArr = {5, 15, 25, 35};
        System.out.println("Int Array: " + Arrays.toString(intArr));
        System.out.println("Average: " + average(intArr) + "\n");

        // Long array of size 5
        long[] longArr = {100L, 200L, 300L, 400L, 500L};
        System.out.println("Long Array: " + Arrays.toString(longArr));
        System.out.println("Average: " + average(longArr) + "\n");

        // Double array of size 6
        double[] doubleArr = {1.5, 2.5, 3.5, 4.5, 5.5, 6.5};
        System.out.println("Double Array: " + Arrays.toString(doubleArr));
        System.out.println("Average: " + average(doubleArr) + "\n");
    }
}
