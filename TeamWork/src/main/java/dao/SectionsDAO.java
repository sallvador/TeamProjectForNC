package dao;

import base.PricesEntity;
import base.SectionsEntity;
import intdao.SectionsInt;
import org.hibernate.Session;

/**
 * Created by Роман on 05.03.2017.
 */
public class SectionsDAO implements SectionsInt{

    @Override
    public void save(SectionsEntity sectionsEntity, Session session) {
        session.beginTransaction();
        session.save(sectionsEntity);
        session.getTransaction().commit();
    }
    @Override
    public void delete(SectionsEntity sectionsEntity, Session session) {
        session.beginTransaction();
        session.delete(sectionsEntity);
        session.getTransaction().commit();

    }
    @Override
    public void update(SectionsEntity sectionsEntity, Session session) {
        session.beginTransaction();
        session.update(sectionsEntity);
        session.getTransaction().commit();

    }
    @Override
    public SectionsEntity getEntityById(long id, Session session) {
        SectionsEntity sectionsEntity;
        session.beginTransaction();
        sectionsEntity = (SectionsEntity) session.get(SectionsEntity.class, id);
        session.getTransaction().commit();
        return sectionsEntity;
    }

}
