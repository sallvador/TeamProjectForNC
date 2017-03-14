package base;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigInteger;

/**
 * Created by Роман on 13.03.2017.
 */
@Entity
@Table(name = "Styles", schema = "public", catalog = "postgres")
public class StylesEntity {
    private BigInteger priority;
    private int artistId;
    private int unitId;
    private int genreId;

    @Basic
    @Column(name = "priority", nullable = false, precision = 0)
    public BigInteger getPriority() {
        return priority;
    }

    public void setPriority(BigInteger priority) {
        this.priority = priority;
    }

    @Basic
    @Column(name = "artist_id", nullable = false)
    public int getArtistId() {
        return artistId;
    }

    public void setArtistId(int artistId) {
        this.artistId = artistId;
    }

    @Basic
    @Column(name = "unit_id", nullable = false)
    public int getUnitId() {
        return unitId;
    }

    public void setUnitId(int unitId) {
        this.unitId = unitId;
    }

    @Basic
    @Column(name = "genre_id", nullable = false)
    public int getGenreId() {
        return genreId;
    }

    public void setGenreId(int genreId) {
        this.genreId = genreId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        StylesEntity that = (StylesEntity) o;

        if (artistId != that.artistId) return false;
        if (unitId != that.unitId) return false;
        if (genreId != that.genreId) return false;
        if (priority != null ? !priority.equals(that.priority) : that.priority != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = priority != null ? priority.hashCode() : 0;
        result = 31 * result + artistId;
        result = 31 * result + unitId;
        result = 31 * result + genreId;
        return result;
    }
}
