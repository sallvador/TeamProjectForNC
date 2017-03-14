package dao;

import intdao.HistoryInt;
import org.hibernate.Session;

/**
 * Created by Роман on 05.03.2017.
 */
public class HistoryDAO implements HistoryInt {

    @Override
    public void save(HistoryEntity historyEntity, Session session) {
        session.beginTransaction();
        session.save(historyEntity);
        session.getTransaction().commit();
    }
    @Override
    public void delete(HistoryEntity historyEntity, Session session) {
        session.beginTransaction();
        session.delete(historyEntity);
        session.getTransaction().commit();

    }
    @Override
    public void update(HistoryEntity historyEntity, Session session) {
        session.beginTransaction();
        session.update(historyEntity);
        session.getTransaction().commit();

    }
    @Override
    public HistoryEntity getEntityById(long id, Session session) {
        HistoryEntity historyEntity;
        session.beginTransaction();
        historyEntity = (HistoryEntity) session.get(HistoryEntity.class, id);
        session.getTransaction().commit();
        return historyEntity;
    }


}
