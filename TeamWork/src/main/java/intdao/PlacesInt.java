package intdao;

import base.PlacesEntity;

/**
 * Created by Роман on 05.03.2017.
 */
public interface PlacesInt {

    public void save(PlacesEntity placesEntity);
    public void delete(PlacesEntity placesEntity);
    public void update(PlacesEntity placesEntity);
    public PlacesEntity getEntityById(long id);

}
