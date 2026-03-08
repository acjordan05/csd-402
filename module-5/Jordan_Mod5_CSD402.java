/*
Name: Aysa Jordan
Course: CSD402
Module: 5.2
Assignment: Arrays & Methods
*/

public class Jordan_Mod5_CSD402 {

    public static void main(String[] args) {

        double[][] doubleArray = {
                {2.5, 3.1, 7.4},
                {9.2, 1.8, 4.6},
                {5.0, 6.7, 8.3}
        };

        int[][] intArray = {
                {4, 8, 2},
                {9, 1, 6},
                {3, 7, 5}
        };

        int[] largestDouble = locateLargest(doubleArray);
        int[] smallestDouble = locateSmallest(doubleArray);

        int[] largestInt = locateLargest(intArray);
        int[] smallestInt = locateSmallest(intArray);

        System.out.println("Largest double at: [" + largestDouble[0] + "][" + largestDouble[1] + "]");
        System.out.println("Smallest double at: [" + smallestDouble[0] + "][" + smallestDouble[1] + "]");

        System.out.println("Largest int at: [" + largestInt[0] + "][" + largestInt[1] + "]");
        System.out.println("Smallest int at: [" + smallestInt[0] + "][" + smallestInt[1] + "]");
    }

    public static int[] locateLargest(double[][] arrayParam) {

        int row = 0;
        int col = 0;
        double largest = arrayParam[0][0];

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] > largest) {
                    largest = arrayParam[i][j];
                    row = i;
                    col = j;
                }
            }
        }

        return new int[]{row, col};
    }

    public static int[] locateLargest(int[][] arrayParam) {

        int row = 0;
        int col = 0;
        int largest = arrayParam[0][0];

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] > largest) {
                    largest = arrayParam[i][j];
                    row = i;
                    col = j;
                }
            }
        }

        return new int[]{row, col};
    }

    public static int[] locateSmallest(double[][] arrayParam) {

        int row = 0;
        int col = 0;
        double smallest = arrayParam[0][0];

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] < smallest) {
                    smallest = arrayParam[i][j];
                    row = i;
                    col = j;
                }
            }
        }

        return new int[]{row, col};
    }

    public static int[] locateSmallest(int[][] arrayParam) {

        int row = 0;
        int col = 0;
        int smallest = arrayParam[0][0];

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] < smallest) {
                    smallest = arrayParam[i][j];
                    row = i;
                    col = j;
                }
            }
        }

        return new int[]{row, col};
    }

}