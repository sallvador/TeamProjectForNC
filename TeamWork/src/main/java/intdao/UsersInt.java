package intdao;

import org.hibernate.Session;

/**
 * Created by Роман on 05.03.2017.
 */
public interface UsersInt {

    public void save(UsersEntity usersEntity,  Session session);
    public void delete(UsersEntity usersEntity, Session session);
    public void update(UsersEntity usersEntity, Session session);
    public UsersEntity getEntityById(long id, Session session);

}
