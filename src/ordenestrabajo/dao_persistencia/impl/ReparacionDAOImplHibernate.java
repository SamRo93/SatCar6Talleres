/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenestrabajo.dao_persistencia.impl;

import java.util.Date;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import ordenestrabajo.dao_persistencia.*;
import ordenestrabajo.presentacion.ClienteEntity;
import ordenestrabajo.presentacion.ReparacionEntity;
import org.hibernate.Query;
import org.hibernate.Session;
import persistencia.dao.BussinessException;
import persistencia.dao.impl.GenericDAOImplHibernate;

/**
 *
 * @author Samuel
 */
public class ReparacionDAOImplHibernate extends GenericDAOImplHibernate<ReparacionEntity, Integer> implements ReparacionDAO{

    @PersistenceContext
    protected EntityManager em;
    
    @Override
    public List<ReparacionEntity> findById(int id) throws BussinessException {
        try{
             Session session = sessionFactory.getCurrentSession();
            Query query = session.createQuery("SELECT login From LoginController login where id like '"+id+"'");
            return query.list();
        }catch(Exception e){
            
        }
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<ReparacionEntity> findByClient(int client) throws BussinessException {
        try{
             Session session = sessionFactory.getCurrentSession();
            Query query = session.createQuery("SELECT login From LoginController login where cliente like '"+client+"'");
            return query.list();
        }catch(Exception e){
            
        }
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<ReparacionEntity> findByMatricula(String matricula) throws BussinessException {
        try{
             Session session = sessionFactory.getCurrentSession();
            Query query = session.createQuery("SELECT login From LoginController login where matricula like '"+matricula+"'");
            return query.list();
        }catch(Exception e){
            
        }
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<ReparacionEntity> findByMarca(String marca) throws BussinessException {
        try{
             Session session = sessionFactory.getCurrentSession();
            Query query = session.createQuery("SELECT login From LoginController login where marca like '"+marca+"'");
            return query.list();
        }catch(Exception e){
            
        }
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<ReparacionEntity> findByFecha(Date fechaIncial, Date fechaFinal) throws BussinessException {
        try{
             Session session = sessionFactory.getCurrentSession();
            Query query = session.createQuery("SELECT login From LoginController login where usuario between :fechaInicial and :fechaFinal");
            return query.list();
        }catch(Exception e){
            
        }
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

