package intdao;

import base.HistoryEntity;

/**
 * Created by Роман on 05.03.2017.
 */
public interface HistoryInt {

    public void save(HistoryEntity historyEntity);
    public void delete(HistoryEntity historyEntity);
    public void update(HistoryEntity historyEntity);
    public HistoryEntity getEntityById(long id);

}
