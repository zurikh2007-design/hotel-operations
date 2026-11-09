package com.pluralsight;

public class Room {
    private double price;
    private int numberOfBeds;
    private boolean occupied;
    private boolean isDirty;
    private boolean available;

    public double getPrice() {
        return price;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public boolean isDirty() {
        return isDirty;
    }

    public boolean isAvailable() {
        return available;
    }


}
