package base;

import javax.persistence.*;

/**
 * Created by Роман on 27.02.2017.
 */
@Entity
@Table(name = "Genres", schema = "public", catalog = "postgres")
public class GenresEntity {
    private int genreId;
    private String genreName;

    @Id
    @Column(name = "genre_id", nullable = false)
    public int getGenreId() {
        return genreId;
    }

    public void setGenreId(int genreId) {
        this.genreId = genreId;
    }

    @Basic
    @Column(name = "genre_name", nullable = false, length = -1)
    public String getGenreName() {
        return genreName;
    }

    public void setGenreName(String genreName) {
        this.genreName = genreName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GenresEntity that = (GenresEntity) o;

        if (genreId != that.genreId) return false;
        if (genreName != null ? !genreName.equals(that.genreName) : that.genreName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = genreId;
        result = 31 * result + (genreName != null ? genreName.hashCode() : 0);
        return result;
    }
}
