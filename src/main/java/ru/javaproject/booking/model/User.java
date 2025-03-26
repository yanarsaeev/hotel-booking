package ru.javaproject.booking.model;

import java.util.List;

public class User {

    private final String name;

    private final String email;

    private final String password;

    private final List<Booking> historyBooking;

    public User(String name, String email, String password, List<Booking> historyBooking) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.historyBooking = historyBooking;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public List<Booking> getHistoryBooking() {
        return historyBooking;
    }
}
