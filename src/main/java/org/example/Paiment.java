package org.example;

import java.time.LocalDateTime;
import java.util.UUID;

public class Paiment {
    private UUID id;
    private Booking booking;
    private float summa;
    private LocalDateTime paimentDate;

    public Paiment(UUID id, Booking booking, float summa, LocalDateTime paimentDate) {
        this.id = id;
        this.booking = booking;
        this.summa = summa;
        this.paimentDate = paimentDate;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Booking getBooking() {
        return booking;
    }

    public void setBooking(Booking booking) {
        this.booking = booking;
    }

    public float getSumma() {
        return summa;
    }

    public void setSumma(float summa) {
        this.summa = summa;
    }

    public LocalDateTime getPaimentDate() {
        return paimentDate;
    }

    public void setPaimentDate(LocalDateTime paimentDate) {
        this.paimentDate = paimentDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Paiment paiment = (Paiment) o;

        if (!id.equals(paiment.id)) return false;
        return booking.equals(paiment.booking);
    }

    @Override
    public int hashCode() {
        int result = id.hashCode();
        result = 31 * result + booking.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Paiment{" +
                "id=" + id +
                ", booking=" + booking +
                ", summa=" + summa +
                ", paimentDate=" + paimentDate +
                '}';
    }
}
