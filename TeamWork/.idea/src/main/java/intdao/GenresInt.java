package intdao;


import base.GenresEntity;

/**
 * Created by Роман on 05.03.2017.
 */
public interface GenresInt {

    public void save(GenresEntity genresEntity);
    public void delete(GenresEntity genresEntit);
    public void update(GenresEntity genresEntit);
    public GenresEntity  getEntityById(long id);

}
