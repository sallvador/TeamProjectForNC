package intdao;

import base.EventsEntity;

/**
 * Created by Роман on 05.03.2017.
 */
public interface EventsInt {

    public void save(EventsEntity eventsEntity);
    public void delete(EventsEntity eventsEntity);
    public void update(EventsEntity eventsEntity);
    public EventsEntity getEntityById(long id);

}
