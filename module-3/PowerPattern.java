/**
 * Name: Aysa Jordan
 * Assignment: Module 3 – Nested Loops Pattern
 * Course: CSD 340
 */

class PowerPattern {

    public static void main(String[] args) {
        int rows = 7;

        for (int i = 0; i < rows; i++) {
            // print leading spaces
            for (int j = 0; j < rows - i - 1; j++) {
                System.out.print("  ");
            }

            // print increasing numbers (powers of 2)
            int value = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(value + " ");
                value *= 2;
            }

            // print decreasing numbers
            value /= 4;
            for (int j = 0; j < i; j++) {
                System.out.print(value + " ");
                value /= 2;
            }

            // print @ symbol
            System.out.println("@");
        }
    }
}
