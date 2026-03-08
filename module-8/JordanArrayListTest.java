/*
Name: Aysa Jordan
Course: CSD402
Module: 8
Assignment: ArrayList Test
*/

import java.util.ArrayList;
import java.util.Scanner;

public class JordanArrayListTest {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("Enter integers (enter 0 to stop):");

        int value;

        do {
            value = input.nextInt();
            numbers.add(value);
        } while (value != 0);

        Integer largest = max(numbers);

        System.out.println("The largest value is: " + largest);
    }

    public static Integer max(ArrayList<Integer> list) {

        if (list == null || list.size() == 0) {
            return 0;
        }

        Integer largest = list.get(0);

        for (Integer num : list) {
            if (num > largest) {
                largest = num;
            }
        }

        return largest;
    }
}