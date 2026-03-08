import java.util.ArrayList;

public class UseFans {

    // Method to display ONE fan (without toString)
    public static void displayFan(Fan fan) {

        if (fan.isOn()) {
            System.out.println("Fan is ON");
            System.out.println("Speed: " + fan.getSpeed());
        } else {
            System.out.println("Fan is OFF");
        }

        System.out.println("Color: " + fan.getColor());
        System.out.println("Radius: " + fan.getRadius());
        System.out.println();
    }

    // Method to display COLLECTION of fans
    public static void displayFans(ArrayList<Fan> fans) {

        for (Fan fan : fans) {
            displayFan(fan);
        }
    }

    public static void main(String[] args) {

        ArrayList<Fan> fanCollection = new ArrayList<>();

        Fan fan1 = new Fan();
        Fan fan2 = new Fan(Fan.FAST, true, 10, "blue");
        Fan fan3 = new Fan(Fan.MEDIUM, true, 8, "yellow");

        fanCollection.add(fan1);
        fanCollection.add(fan2);
        fanCollection.add(fan3);

        displayFans(fanCollection);
    }
}