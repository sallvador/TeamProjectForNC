package intdao;

import base.ArtistsEntity;
import base.EventsEntity;
import org.hibernate.Session;

/**
 * Created by Роман on 05.03.2017.
 */
public interface ArtistsInt {

    public void save(ArtistsEntity artistsEntity, Session session);
    public void delete(ArtistsEntity artistsEntity, Session session);
    public void update(ArtistsEntity artistsEntity, Session session);
    public ArtistsEntity getEntityById(long id, Session session);

}
