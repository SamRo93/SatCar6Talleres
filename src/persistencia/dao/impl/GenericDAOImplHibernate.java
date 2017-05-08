package persistencia.dao.impl;

import persistencia.dao.GenericDAO;
import persistencia.dao.BussinessException;
import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.ejb.*;
import org.springframework.beans.factory.annotation.Autowired;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Samuel
 */
public class GenericDAOImplHibernate<T, ID extends Serializable> implements GenericDAO<T, ID> {
    
    @Autowired
    public SessionFactory sessionFactory;
    
    private final static Logger LOGGER = Logger.getLogger(GenericDAOImplHibernate.class.getName());
    
    public GenericDAOImplHibernate(){}

    @Override
    public void saveOrUpdate(T entity) throws BussinessException {
        Session session = sessionFactory.getCurrentSession();
        try{
            session.beginTransaction();
            session.saveOrUpdate(entity);
            session.getTransaction().commit();
            
        }catch(Exception e){
            System.out.println("Fallo intentando salvar");
        }
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(T entity, ID id) throws BussinessException {
        Session session = sessionFactory.getCurrentSession();
        try{
            session.beginTransaction();
            session.delete(entity);
            session.getTransaction().commit();
        }catch(Exception e){
            
        }
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
