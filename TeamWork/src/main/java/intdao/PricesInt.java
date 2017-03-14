package intdao;

import org.hibernate.Session;

/**
 * Created by Роман on 05.03.2017.
 */
public interface PricesInt {

    public void save(PricesEntity pricesEntity, Session session);
    public void delete(PricesEntity pricesEntity, Session session);
    public void update(PricesEntity pricesEntity, Session session);
    public PricesEntity getEntityById(long id, Session session);

}
