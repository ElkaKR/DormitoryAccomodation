package org.example;

import java.util.Set;
import java.util.UUID;

public class Dormitory {
    private UUID id;
    private String address;
    private Set<Room> rooms;
    private Set<User> students;

    public Dormitory(UUID id, String address) {
        this.id = id;
        this.address = address;
    }

    public UUID getId() {
        return id;
    }

    public String getAddress() {
        return address;
    }

    public Set<Room> getRooms() {
        return rooms;
    }

    public Set<User> getStudents() {
        return students;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setRooms(Set<Room> rooms) {
        this.rooms = rooms;
    }

    public void setStudents(Set<User> students) {
        this.students = students;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Dormitory dormitory = (Dormitory) o;

        if (!id.equals(dormitory.id)) return false;
        return address.equals(dormitory.address);
    }

    @Override
    public int hashCode() {
        int result = id.hashCode();
        result = 31 * result + address.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Dormitory{" +
                "address='" + address + '\'' +
                ", rooms=" + rooms +
                ", students=" + students +
                '}';
    }
}
