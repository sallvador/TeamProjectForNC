package intdao;

import base.HistoryEntity;
import org.hibernate.Session;

/**
 * Created by Роман on 05.03.2017.
 */
public interface HistoryInt {

    public void save(HistoryEntity historyEntity, Session session);
    public void delete(HistoryEntity historyEntity, Session session);
    public void update(HistoryEntity historyEntity, Session session);
    public HistoryEntity getEntityById(long id, Session session);

}
