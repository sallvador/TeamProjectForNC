package intdao;

import base.PricesEntity;

/**
 * Created by Роман on 05.03.2017.
 */
public interface PricesInt {

    public void save(PricesEntity pricesEntity);
    public void delete(PricesEntity pricesEntity);
    public void update(PricesEntity pricesEntity);
    public PricesEntity getEntityById(long id);

}
