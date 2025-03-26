package ru.javaproject.booking.model;

public class Room {
    private final String room;

    private final int price;

    private final String description;

    private boolean isBooked;

    public Room(String room, int price, String description, boolean isBooked) {
        this.room = room;
        this.price = price;
        this.description = description;
        this.isBooked = isBooked;
    }

    public String getRoom() {
        return room;
    }

    public int getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public boolean isBooked() {
        return isBooked;
    }

    public void setBooked(boolean booked) {
        isBooked = booked;
    }
}
