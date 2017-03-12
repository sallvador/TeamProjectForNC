package dao;

import base.EventsEntity;
import base.GenresEntity;
import intdao.GenresInt;
import org.hibernate.Session;

/**
 * Created by Роман on 05.03.2017.
 */
public class GenresDAO implements GenresInt {

    @Override
    public void save(GenresEntity genresEntity, Session session) {
        session.beginTransaction();
        session.save(genresEntity);
        session.getTransaction().commit();
    }
    @Override
    public void delete(GenresEntity genresEntity, Session session) {
        session.beginTransaction();
        session.delete(genresEntity);
        session.getTransaction().commit();

    }
    @Override
    public void update(GenresEntity genresEntity, Session session) {
        session.beginTransaction();
        session.update(genresEntity);
        session.getTransaction().commit();

    }
    @Override
    public GenresEntity getEntityById(long id, Session session) {
        GenresEntity genresEntity;
        session.beginTransaction();
        genresEntity = (GenresEntity) session.get(GenresEntity.class, id);
        session.getTransaction().commit();
        return genresEntity;
    }


}
