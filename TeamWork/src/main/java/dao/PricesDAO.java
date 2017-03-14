package dao;

import intdao.PricesInt;
import org.hibernate.Session;

/**
 * Created by Роман on 05.03.2017.
 */
public class PricesDAO implements PricesInt {

    @Override
    public void save(PricesEntity pricesEntity, Session session) {
        session.beginTransaction();
        session.save(pricesEntity);
        session.getTransaction().commit();
    }
    @Override
    public void delete(PricesEntity pricesEntity, Session session) {
        session.beginTransaction();
        session.delete(pricesEntity);
        session.getTransaction().commit();

    }
    @Override
    public void update(PricesEntity pricesEntity, Session session) {
        session.beginTransaction();
        session.update(pricesEntity);
        session.getTransaction().commit();

    }
    @Override
    public PricesEntity getEntityById(long id, Session session) {
        PricesEntity pricesEntity;
        session.beginTransaction();
        pricesEntity = (PricesEntity) session.get(PricesEntity.class, id);
        session.getTransaction().commit();
        return pricesEntity;
    }

}
