package intdao;

import base.StylesEntity;

import static sun.rmi.registry.RegistryImpl.id;

/**
 * Created by Роман on 05.03.2017.
 */
public interface StylesInt {

    public void save(StylesEntity stylesEntity);
    public void delete(StylesEntity stylesEntity);
    public void update(StylesEntity stylesEntity;
    public StylesEntity getEntityById(long id);

}
