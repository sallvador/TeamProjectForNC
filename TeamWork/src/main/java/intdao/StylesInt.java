package intdao;

import org.hibernate.Session;

/**
 * Created by Роман on 05.03.2017.
 */
public interface StylesInt {

    public void save(StylesEntity stylesEntity, Session session);
    public void delete(StylesEntity stylesEntity, Session session);
    public void update(StylesEntity stylesEntity, Session session);
    public StylesEntity getEntityById(long id, Session session);

}
