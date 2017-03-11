package base;

import javax.persistence.*;

/**
 * Created by Роман on 27.02.2017.
 */
@Entity
@Table(name = "Selections", schema = "public", catalog = "postgres")
public class SelectionsEntity {
    private int selectionId;
    private int placeId;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Id
    @Column(name = "selection_id", nullable = false)
    public int getSelectionId() {
        return selectionId;
    }

    public void setSelectionId(int selectionId) {
        this.selectionId = selectionId;
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

        SelectionsEntity that = (SelectionsEntity) o;

        if (selectionId != that.selectionId) return false;
        if (placeId != that.placeId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = selectionId;
        result = 31 * result + placeId;
        return result;
    }
}
