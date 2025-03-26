package ru.javaproject.booking.model;

public class Hotel {
    private final String name;

    private final String address;

    private final String description;

    private final String rating;

    public Hotel(String name, String address, String description, String rating) {
        this.name = name;
        this.address = address;
        this.description = description;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getDescription() {
        return description;
    }

    public String getRating() {
        return rating;
    }
}
