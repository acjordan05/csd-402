/*
Name: Aysa Jordan
Course: CSD402
Module: 6.2
Assignment: Objects & Classes
*/

public class Jordan_Mod6_CSD402 {

    public static void main(String[] args) {

        Fan fan1 = new Fan();
        Fan fan2 = new Fan(Fan.FAST, true, 10, "blue");

        System.out.println("Fan 1:");
        System.out.println(fan1.toString());

        System.out.println();

        System.out.println("Fan 2:");
        System.out.println(fan2.toString());

        fan1.setSpeed(Fan.MEDIUM);
        fan1.setOn(true);
        fan1.setRadius(8);
        fan1.setColor("yellow");

        System.out.println();
        System.out.println("Fan 1 after changes:");
        System.out.println(fan1.toString());
    }
}