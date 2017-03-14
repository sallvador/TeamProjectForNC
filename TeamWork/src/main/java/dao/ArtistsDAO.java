package dao;

import base.ArtistsEntity;
import intdao.ArtistsInt;
import org.hibernate.Session;

/**
 * Created by Роман on 05.03.2017.
 */
public class ArtistsDAO implements ArtistsInt {

    @Override
    public void save(ArtistsEntity artistsEntity, Session session) {
        session.beginTransaction();
        session.save(artistsEntity);
        session.getTransaction().commit();
    }
    @Override
    public void delete(ArtistsEntity artistsEntity, Session session) {
        session.beginTransaction();
        session.delete(artistsEntity);
        session.getTransaction().commit();

    }
    @Override
    public void update(ArtistsEntity artistsEntity, Session session) {
        session.beginTransaction();
        session.update(artistsEntity);
        session.getTransaction().commit();

    }
    @Override
    public ArtistsEntity getEntityById(long id, Session session) {
        ArtistsEntity artistsEntity;
        session.beginTransaction();
        artistsEntity = (ArtistsEntity) session.get(ArtistsEntity.class, id);
        session.getTransaction().commit();
        return artistsEntity;
    }


}
