package org.example;

import java.util.Objects;
import java.util.UUID;

public class Room {
    private UUID id;
    private String number;
    private Dormitory dormitory;
    private User student;
    private boolean occupied;

    public Room(UUID id, String number, Dormitory dormitory) {
        this.id = id;
        this.number = number;
        this.dormitory = dormitory;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Dormitory getDormitory() {
        return dormitory;
    }

    public void setDormitory(Dormitory dormitory) {
        this.dormitory = dormitory;
    }

    public User getStudent() {
        return student;
    }

    public void setStudent(User student) {
        this.student = student;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public void setOccupied(boolean occupied) {
        this.occupied = occupied;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Room room = (Room) o;

        if (!Objects.equals(id, room.id)) return false;
        if (!Objects.equals(number, room.number)) return false;
        return Objects.equals(dormitory, room.dormitory);
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (number != null ? number.hashCode() : 0);
        result = 31 * result + (dormitory != null ? dormitory.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Room{" +
                "number='" + number + '\'' +
                ", dormitory=" + dormitory +
                ", student=" + student +
                ", occupied=" + occupied +
                '}';
    }
}
