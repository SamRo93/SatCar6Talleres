package persistencia.dao;

/**
 *
 * @author Samuel
 */
import java.io.Serializable;
import java.util.*;


public interface GenericDAO<T,ID extends Serializable> {
    void saveOrUpdate(T entity) throws Exception;
    void delete(T entity) throws Exception;
}