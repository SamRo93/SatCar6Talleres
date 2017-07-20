/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenestrabajo.dao_persistencia.impl;

import java.util.Date;
import java.util.List;
import ordenestrabajo.dao_persistencia.*;
import org.hibernate.Query;
import org.hibernate.Session;
import persistencia.dao.BussinessException;
import persistencia.dao.impl.GenericDAOImplHibernate;
import satcar6.entity.ReparacionEntity;
import satcar6.util.HibernateUtil;

/**
 *
 * @author Samuel
 */
public class ReparacionDAOImplHibernate extends GenericDAOImplHibernate<ReparacionEntity, Integer> implements ReparacionDAO{

    @Override
    public ReparacionEntity findById(int id) throws BussinessException {
        try{
             Session session = HibernateUtil.getSessionFactory().openSession();
            Query query = session.createQuery("SELECT login From ReparacionEntity login where id = "+id+";");
            return (ReparacionEntity) query.getSingleResult();
        }catch(Exception e){
            
        }
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<ReparacionEntity> findByClient(int client) throws BussinessException {
        try{
             Session session = HibernateUtil.getSessionFactory().openSession();
            Query query = session.createQuery("SELECT login From ReparacionEntity login where cliente = "+client+";");
            return query.list();
        }catch(Exception e){
            
        }
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<ReparacionEntity> findByMatricula(String matricula) throws BussinessException {
        try{
             Session session = HibernateUtil.getSessionFactory().openSession();
            Query query = session.createQuery("SELECT login From ReparacionEntity login where matricula like '"+matricula+"';");
            return query.list();
        }catch(Exception e){
            
        }
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<ReparacionEntity> findByMarca(String marca) throws BussinessException {
        try{
             Session session = HibernateUtil.getSessionFactory().openSession();
            Query query = session.createQuery("SELECT login From ReparacionEntity login where marca like '"+marca+"';");
            return query.list();
        }catch(Exception e){
            
        }
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<ReparacionEntity> findByFecha(Date fechaIncial, Date fechaFinal) throws BussinessException {
        try{
             Session session = HibernateUtil.getSessionFactory().openSession();
            Query query = session.createQuery("SELECT login From ReparacionEntity login where usuario between"+fechaIncial+" and "+fechaFinal+";");
            return query.list();
        }catch(Exception e){
            
        }
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

