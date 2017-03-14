package base;

import javax.persistence.*;

/**
 * Created by Роман on 13.03.2017.
 */
@Entity
@Table(name = "Sections", schema = "public", catalog = "postgres")
public class SectionsEntity {
    private int sectionId;
    private int placeId;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Id
    @Column(name = "section_id", nullable = false)
    public int getSectionId() {
        return sectionId;
    }

    public void setSectionId(int sectionId) {
        this.sectionId = sectionId;
    }

    @Basic
    @Column(name = "place_id", nullable = false)
    public int getPlaceId() {
        return placeId;
    }

    public void setPlaceId(int placeId) {
        this.placeId = placeId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SectionsEntity that = (SectionsEntity) o;

        if (sectionId != that.sectionId) return false;
        if (placeId != that.placeId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = sectionId;
        result = 31 * result + placeId;
        return result;
    }
}
