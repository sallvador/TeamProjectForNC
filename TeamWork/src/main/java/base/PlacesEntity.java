package base;

import javax.persistence.*;
import java.math.BigInteger;

/**
 * Created by Роман on 13.03.2017.
 */
@Entity
@Table(name = "Places", schema = "public", catalog = "postgres")
public class PlacesEntity {
    private int placeId;
    private String address;
    private String placeName;
    private String information;
    private BigInteger phone;

    @Id
    @Column(name = "place_id", nullable = false)
    public int getPlaceId() {
        return placeId;
    }

    public void setPlaceId(int placeId) {
        this.placeId = placeId;
    }

    @Basic
    @Column(name = "address", nullable = false, length = -1)
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Basic
    @Column(name = "place_name", nullable = false, length = -1)
    public String getPlaceName() {
        return placeName;
    }

    public void setPlaceName(String placeName) {
        this.placeName = placeName;
    }

    @Basic
    @Column(name = "information", nullable = true, length = -1)
    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }

    @Basic
    @Column(name = "phone", nullable = false, precision = 0)
    public BigInteger getPhone() {
        return phone;
    }

    public void setPhone(BigInteger phone) {
        this.phone = phone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PlacesEntity that = (PlacesEntity) o;

        if (placeId != that.placeId) return false;
        if (address != null ? !address.equals(that.address) : that.address != null) return false;
        if (placeName != null ? !placeName.equals(that.placeName) : that.placeName != null) return false;
        if (information != null ? !information.equals(that.information) : that.information != null) return false;
        if (phone != null ? !phone.equals(that.phone) : that.phone != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = placeId;
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (placeName != null ? placeName.hashCode() : 0);
        result = 31 * result + (information != null ? information.hashCode() : 0);
        result = 31 * result + (phone != null ? phone.hashCode() : 0);
        return result;
    }
}
