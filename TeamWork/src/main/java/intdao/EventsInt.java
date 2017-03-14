package intdao;

import org.hibernate.Session;

/**
 * Created by Роман on 05.03.2017.
 */
public interface EventsInt {

    public void save(EventsEntity eventsEntity, Session session);
    public void delete(EventsEntity eventsEntity, Session session);
    public void update(EventsEntity eventsEntity, Session session);
    public EventsEntity getEntityById(long id, Session session);

}
