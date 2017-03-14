package intdao;

import org.hibernate.Session;

/**
 * Created by Роман on 05.03.2017.
 */
public interface PlacesInt {

    public void save(PlacesEntity placesEntity, Session session);
    public void delete(PlacesEntity placesEntity, Session session);
    public void update(PlacesEntity placesEntity, Session session);
    public PlacesEntity getEntityById(long id, Session session);

}
