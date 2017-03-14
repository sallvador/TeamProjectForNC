package dao;

import intdao.StylesInt;
import org.hibernate.Session;

/**
 * Created by Роман on 05.03.2017.
 */
public class StylesDAO implements StylesInt{

    @Override
    public void save(StylesEntity stylesEntity, Session session) {
        session.beginTransaction();
        session.save(stylesEntity);
        session.getTransaction().commit();
    }
    @Override
    public void delete(StylesEntity stylesEntity, Session session) {
        session.beginTransaction();
        session.delete(stylesEntity);
        session.getTransaction().commit();

    }
    @Override
    public void update(StylesEntity stylesEntity, Session session) {
        session.beginTransaction();
        session.update(stylesEntity);
        session.getTransaction().commit();

    }
    @Override
    public StylesEntity getEntityById(long id, Session session) {
        StylesEntity stylesEntity;
        session.beginTransaction();
        stylesEntity = (StylesEntity) session.get(StylesEntity.class, id);
        session.getTransaction().commit();
        return stylesEntity;
    }

}
