package base;

import javax.persistence.*;
import java.math.BigInteger;

/**
 * Created by Роман on 13.03.2017.
 */
@Entity
@Table(name = "Prices", schema = "public", catalog = "postgres")
public class PricesEntity {
    private int bookingId;
    private int eventId;
    private int selectionId;
    private BigInteger price;

    @Id
    @Column(name = "booking_id", nullable = false)
    public int getBookingId() {
        return bookingId;
    }

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }

    @Basic
    @Column(name = "event_id", nullable = false)
    public int getEventId() {
        return eventId;
    }

    public void setEventId(int eventId) {
        this.eventId = eventId;
    }

    @Basic
    @Column(name = "selection_id", nullable = false)
    public int getSelectionId() {
        return selectionId;
    }

    public void setSelectionId(int selectionId) {
        this.selectionId = selectionId;
    }

    @Basic
    @Column(name = "price", nullable = false, precision = 0)
    public BigInteger getPrice() {
        return price;
    }

    public void setPrice(BigInteger price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PricesEntity that = (PricesEntity) o;

        if (bookingId != that.bookingId) return false;
        if (eventId != that.eventId) return false;
        if (selectionId != that.selectionId) return false;
        if (price != null ? !price.equals(that.price) : that.price != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = bookingId;
        result = 31 * result + eventId;
        result = 31 * result + selectionId;
        result = 31 * result + (price != null ? price.hashCode() : 0);
        return result;
    }
}
