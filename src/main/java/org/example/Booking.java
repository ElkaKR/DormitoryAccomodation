package org.example;

import java.time.LocalDateTime;
import java.util.Objects;
import java.util.UUID;

public class Booking {
    private UUID id;
    private Dormitory dormitory;
    private Room room;
    private User student;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private boolean paid;

    public Booking(UUID id, Dormitory dormitory, Room room, User student, LocalDateTime startDate, LocalDateTime endDate) {
        this.id = id;
        this.dormitory = dormitory;
        this.room = room;
        this.student = student;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Dormitory getDormitory() {
        return dormitory;
    }

    public void setDormitory(Dormitory dormitory) {
        this.dormitory = dormitory;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public User getStudent() {
        return student;
    }

    public void setStudent(User student) {
        this.student = student;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
    }

    public LocalDateTime getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDateTime endDate) {
        this.endDate = endDate;
    }

    public boolean isPaid() {
        return paid;
    }

    public void setPaid(boolean paid) {
        this.paid = paid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Booking booking = (Booking) o;

        if (!Objects.equals(id, booking.id)) return false;
        if (!dormitory.equals(booking.dormitory)) return false;
        if (!room.equals(booking.room)) return false;
        if (!student.equals(booking.student)) return false;
        if (!startDate.equals(booking.startDate)) return false;
        return endDate.equals(booking.endDate);
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + dormitory.hashCode();
        result = 31 * result + room.hashCode();
        result = 31 * result + student.hashCode();
        result = 31 * result + startDate.hashCode();
        result = 31 * result + endDate.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "id=" + id +
                ", dormitory=" + dormitory +
                ", room=" + room +
                ", student=" + student +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", paid=" + paid +
                '}';
    }
}
