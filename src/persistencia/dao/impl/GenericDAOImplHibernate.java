package persistencia.dao.impl;

import persistencia.dao.GenericDAO;
import persistencia.dao.BussinessException;
import java.io.Serializable;
import java.util.logging.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import satcar6.util.HibernateUtil;

/**
 *
 * @author Samuel
 */
public class GenericDAOImplHibernate<T, ID extends Serializable> implements GenericDAO<T, ID> {
    
    private final static Logger LOGGER = Logger.getLogger(GenericDAOImplHibernate.class.getName());
    
    public GenericDAOImplHibernate(){}
    Session session;
    @Override
public void saveOrUpdate(T entity) throws BussinessException {
    if(session ==null){
        session = HibernateUtil.getSessionFactory().openSession();
    }else session = HibernateUtil.getSessionFactory().getCurrentSession();
        
        try{
            session.beginTransaction();
            session.saveOrUpdate(entity);
            session.getTransaction().commit();
            
        }catch(Exception e){
            System.out.println("Fallo intentando salvar");
        }
    }

    @Override
    public void delete(T entity) throws BussinessException {
        Session session = HibernateUtil.getSessionFactory().openSession();
        try{
            session.beginTransaction();
            session.delete(entity);
            session.getTransaction().commit();
        }catch(Exception e){
            System.err.println("No pudo entrar en: " + entity.getClass().getName());
        }
    }

}
