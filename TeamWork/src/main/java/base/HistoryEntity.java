package base;

import javax.persistence.*;

/**
 * Created by Роман on 27.02.2017.
 */
@Entity
@Table(name = "History", schema = "public", catalog = "postgres")
public class HistoryEntity {
    private int userId;
    private int eventId;
    private int sectionId;
    private int historyId;

    @Basic
    @Column(name = "user_id", nullable = false)
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
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
    @Column(name = "section_id", nullable = false)
    public int getSectionId() {
        return sectionId;
    }

    public void setSectionId(int sectionId) {
        this.sectionId = sectionId;
    }

    @Id
    @Column(name = "history_id", nullable = false)
    public int getHistoryId() {
        return historyId;
    }

    public void setHistoryId(int historyId) {
        this.historyId = historyId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        HistoryEntity that = (HistoryEntity) o;

        if (userId != that.userId) return false;
        if (eventId != that.eventId) return false;
        if (sectionId != that.sectionId) return false;
        if (historyId != that.historyId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = userId;
        result = 31 * result + eventId;
        result = 31 * result + sectionId;
        result = 31 * result + historyId;
        return result;
    }
}
