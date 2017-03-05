package intdao;

import base.ArtistsEntity;
import base.UsersEntity;

/**
 * Created by Роман on 05.03.2017.
 */
public interface UsersInt {

    public void save(UsersEntity usersEntity);
    public void delete(UsersEntity usersEntity);
    public void update(UsersEntity usersEntity);
    public UsersEntity getEntityById(long id);

}
