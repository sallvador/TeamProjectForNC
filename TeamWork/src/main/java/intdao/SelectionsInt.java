package intdao;

import base.SelectionsEntity;

/**
 * Created by Роман on 05.03.2017.
 */
public interface SelectionsInt {

    public void save(SelectionsEntity selectionsEntity);
    public void delete(SelectionsEntity selectionsEntity);
    public void update(SelectionsEntity selectionsEntity);
    public SelectionsEntity getEntityById(long id);

}
