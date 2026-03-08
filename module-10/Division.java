/*
Name: Aysa Jordan
Course: CSD402
Module: 10
Assignment: Abstract Classes
*/

public abstract class Division {

    protected String divisionName;
    protected int accountNumber;

    // Constructor
    public Division(String divisionName, int accountNumber) {
        this.divisionName = divisionName;
        this.accountNumber = accountNumber;
    }

    // Abstract method
    public abstract void display();
}