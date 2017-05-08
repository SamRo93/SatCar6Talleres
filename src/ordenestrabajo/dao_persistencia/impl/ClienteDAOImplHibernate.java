/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenestrabajo.dao_persistencia.impl;

import java.util.List;
import ordenestrabajo.dao_persistencia.ClienteDAO;
import ordenestrabajo.presentacion.Cliente;
import ordenestrabajo.presentacion.LoginController;
import org.hibernate.Query;
import org.hibernate.Session;
import persistencia.dao.BussinessException;
import persistencia.dao.impl.GenericDAOImplHibernate;

/**
 *
 * @author samuel.romero
 */

public class ClienteDAOImplHibernate extends GenericDAOImplHibernate<Cliente, Integer> implements ClienteDAO {
    
    @Override
    public List<Cliente> findByNClient(int id) throws BussinessException {
        try{
            Session session = sessionFactory.getCurrentSession();
            Query query = session.createQuery("SELECT client From Cliente client where id like '"+id+"'");
            return query.list();
        }catch(Exception e){
            
        }
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Cliente> findByName(String nombreComercial) throws BussinessException {
            try{
                Session session = sessionFactory.getCurrentSession();
                Query query = session.createQuery("SELECT client From Cliente client where nombreComercial like '%"+nombreComercial+"%'");
                return query.list();
            }catch(Exception e){
                
            }
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Cliente> findBySocialReason(String socialReason) throws BussinessException {
        try{
            Session session = sessionFactory.getCurrentSession();
            Query query = session.createQuery("SELECT client From Cliente client where razonSocial like '%"+socialReason+"%'");
            return query.list();
        }catch(Exception e){
        }
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Cliente> findByNif(String nif) throws BussinessException {
        try{
            Session session = sessionFactory.getCurrentSession();
            Query query = session.createQuery("SELECT client From Cliente client where NIF like '%"+nif+"%'");
            return query.list();
        }catch(Exception e){
            
        }
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
