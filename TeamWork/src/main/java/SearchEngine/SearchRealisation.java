package SearchEngine;

import base.EventsEntity;
import base.UsersEntity;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import util.HiberSF;

import java.sql.Date;
import java.util.Calendar;
import java.util.List;
import java.util.Map;

/**
 * Created by demon on 07.03.2017.
 */
public class SearchRealisation implements SearchInterface {
    @Override
    public UsersEntity getUserByloginAndPass(String login, String password) {
        UsersEntity user = null;
        SessionFactory sessionFactory = HiberSF.getSessionFactory();
        Session session = sessionFactory.openSession();
        Query query = session.createQuery("from UsersEntity where (login = :login) " +
                "and (password = :password)").setString("login", login).setString("password", password);
        user = (UsersEntity) query.uniqueResult();
        return user;
    }

    @Override
    public List<EventsEntity> getFutureEvents() {
        List<EventsEntity> events = null;
        SessionFactory sessionFactory = HiberSF.getSessionFactory();
        Session session = sessionFactory.openSession();
        //TODO Make a window to get finite number of events
        Query query = session.createQuery("from EventsEntity where age(date)>0 order by date");
        events = query.list();
        session.close();
        sessionFactory.close();
        return events;
    }

    @Override
    public List<EventsEntity> getUsersEvents(UsersEntity user) {
        List<EventsEntity> events = null;
        SessionFactory sessionFactory = HiberSF.getSessionFactory();
        Session session = sessionFactory.openSession();
        Query query = session.createQuery("from EventsEntity where eventId in " +
                "(select distinct eventId from HistoryEntity where (userId = :id))").setLong("id", user.getUserId());
        events = query.list();
        session.close();
        sessionFactory.close();
        return events;
    }

    @Override
    public List<EventsEntity> getEventsForSearch(Map<String, String> SearchArguments) {
        return null;
    }
}
