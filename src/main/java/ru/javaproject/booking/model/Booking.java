package ru.javaproject.booking.model;

import java.time.LocalDate;

public class Booking {
    private final User user;

    private final Hotel hotel;

    private final Room room;

    private final LocalDate startDate;

    private final LocalDate endDate;

    public Booking(User user, Hotel hotel, Room room, LocalDate startDate, LocalDate endDate) {
        this.user = user;
        this.hotel = hotel;
        this.room = room;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public User getUser() {
        return user;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public Room getRoom() {
        return room;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }
}
