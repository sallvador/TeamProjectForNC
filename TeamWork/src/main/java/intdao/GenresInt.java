package intdao;


import org.hibernate.Session;

/**
 * Created by Роман on 05.03.2017.
 */
public interface GenresInt {

    public void save(GenresEntity genresEntity, Session session);
    public void delete(GenresEntity genresEntity, Session session);
    public void update(GenresEntity genresEntity, Session session);
    public GenresEntity  getEntityById(long id, Session session);

}
