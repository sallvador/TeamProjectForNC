package dao;

import intdao.EventsInt;
import org.hibernate.Session;

/**
 * Created by Роман on 05.03.2017.
 */
public class EventsDAO implements EventsInt {

    @Override
    public void save(EventsEntity eventsEntity, Session session) {
        session.beginTransaction();
        session.save(eventsEntity);
        session.getTransaction().commit();
    }
    @Override
    public void delete(EventsEntity eventsEntity, Session session) {
        session.beginTransaction();
        session.delete(eventsEntity);
        session.getTransaction().commit();

    }
    @Override
    public void update(EventsEntity eventsEntity, Session session) {
        session.beginTransaction();
        session.update(eventsEntity);
        session.getTransaction().commit();

    }
    @Override
    public EventsEntity getEntityById(long id, Session session) {
        EventsEntity eventsEntity;
        session.beginTransaction();
        eventsEntity = (EventsEntity) session.get(EventsEntity.class, id);
        session.getTransaction().commit();
        return eventsEntity;
    }

}
