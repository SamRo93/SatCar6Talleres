/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenestrabajo.dao_persistencia.impl;

import java.util.Date;
import java.util.List;
import ordenestrabajo.dao_persistencia.*;
import ordenestrabajo.presentacion.Cliente;
import ordenestrabajo.presentacion.ReparacionController;
import org.hibernate.Query;
import org.hibernate.Session;
import persistencia.dao.BussinessException;
import persistencia.dao.impl.GenericDAOImplHibernate;

/**
 *
 * @author Samuel
 */
public class ReparacionDAOImplHibernate extends GenericDAOImplHibernate<ReparacionController, Integer> implements ReparacionDAO{

    @Override
    public List<ReparacionController> findById(int id) throws BussinessException {
        try{
             Session session = sessionFactory.getCurrentSession();
            Query query = session.createQuery("SELECT login From LoginController login where id like '"+id+"'");
            return query.list();
        }catch(Exception e){
            
        }
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<ReparacionController> findByClient(int client) throws BussinessException {
        try{
             Session session = sessionFactory.getCurrentSession();
            Query query = session.createQuery("SELECT login From LoginController login where cliente like '"+client+"'");
            return query.list();
        }catch(Exception e){
            
        }
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<ReparacionController> findByMatricula(String matricula) throws BussinessException {
        try{
             Session session = sessionFactory.getCurrentSession();
            Query query = session.createQuery("SELECT login From LoginController login where matricula like '"+matricula+"'");
            return query.list();
        }catch(Exception e){
            
        }
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<ReparacionController> findByMarca(String marca) throws BussinessException {
        try{
             Session session = sessionFactory.getCurrentSession();
            Query query = session.createQuery("SELECT login From LoginController login where marca like '"+marca+"'");
            return query.list();
        }catch(Exception e){
            
        }
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<ReparacionController> findByFecha(Date fechaIncial, Date fechaFinal) throws BussinessException {
        try{
             Session session = sessionFactory.getCurrentSession();
            Query query = session.createQuery("SELECT login From LoginController login where usuario between :fechaInicial and :fechaFinal");
            return query.list();
        }catch(Exception e){
            
        }
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

