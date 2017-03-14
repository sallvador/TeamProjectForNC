package intdao;

import org.hibernate.Session;

/**
 * Created by Роман on 05.03.2017.
 */
public interface SectionsInt {

    public void save(SectionsEntity selectionsEntity, Session session);
    public void delete(SectionsEntity selectionsEntity, Session session);
    public void update(SectionsEntity selectionsEntity, Session session);
    public SectionsEntity getEntityById(long id, Session session);

}
