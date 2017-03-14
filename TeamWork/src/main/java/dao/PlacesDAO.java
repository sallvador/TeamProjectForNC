package dao;

import intdao.PlacesInt;
import org.hibernate.Session;

/**
 * Created by Роман on 05.03.2017.
 */
public class PlacesDAO implements PlacesInt {

    @Override
    public void save(PlacesEntity placesEntity, Session session) {
        session.beginTransaction();
        session.save(placesEntity);
        session.getTransaction().commit();
    }
    @Override
    public void delete(PlacesEntity placesEntity, Session session) {
        session.beginTransaction();
        session.delete(placesEntity);
        session.getTransaction().commit();

    }
    @Override
    public void update(PlacesEntity placesEntity, Session session) {
        session.beginTransaction();
        session.update(placesEntity);
        session.getTransaction().commit();

    }
    @Override
    public PlacesEntity getEntityById(long id, Session session) {
        PlacesEntity placesEntity;
        session.beginTransaction();
        placesEntity = (PlacesEntity) session.get(PlacesEntity.class, id);
        session.getTransaction().commit();
        return placesEntity;
    }


}
