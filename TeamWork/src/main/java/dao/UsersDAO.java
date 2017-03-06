package dao;


import base.UsersEntity;
import intdao.UsersInt;
import org.hibernate.Session;

/**
 * Created by Роман on 05.03.2017.
 */
public class UsersDAO implements UsersInt{

    @Override
    public void save(UsersEntity usersEntity, Session session) {
        session.beginTransaction();
        session.save(usersEntity);
        session.getTransaction().commit();
    }
    @Override
    public void delete(UsersEntity usersEntity, Session session) {
        session.beginTransaction();
        session.delete(usersEntity);
        session.getTransaction().commit();

    }
    @Override
    public void update(UsersEntity usersEntity, Session session) {
        session.beginTransaction();
        session.update(usersEntity);
        session.getTransaction().commit();

    }
    @Override
    public UsersEntity getEntityById(long id, Session session) {
        UsersEntity usersEntity;
        session.beginTransaction();
        usersEntity = (UsersEntity) session.get(UsersEntity.class, id);
        session.getTransaction().commit();
        return usersEntity;
    }


}
