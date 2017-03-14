package base;

import javax.persistence.*;
import java.util.Arrays;

/**
 * Created by Роман on 13.03.2017.
 */
@Entity
@Table(name = "Artists", schema = "public", catalog = "postgres")
public class ArtistsEntity {
    private int artistId;
    private String information;
    private byte[] picture;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Id
    @Column(name = "artist_id", nullable = false)
    public int getArtistId() {
        return artistId;
    }

    public void setArtistId(int artistId) {
        this.artistId = artistId;
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
    @Column(name = "picture", nullable = false)
    public byte[] getPicture() {
        return picture;
    }

    public void setPicture(byte[] picture) {
        this.picture = picture;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ArtistsEntity that = (ArtistsEntity) o;

        if (artistId != that.artistId) return false;
        if (information != null ? !information.equals(that.information) : that.information != null) return false;
        if (!Arrays.equals(picture, that.picture)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = artistId;
        result = 31 * result + (information != null ? information.hashCode() : 0);
        result = 31 * result + Arrays.hashCode(picture);
        return result;
    }
}
