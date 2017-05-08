/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenestrabajo.dao_persistencia.impl;

import java.util.List;
import ordenestrabajo.dao_persistencia.LoginDAO;
import ordenestrabajo.presentacion.LoginController;
import org.hibernate.Query;
import org.hibernate.Session;
import persistencia.dao.BussinessException;
import persistencia.dao.impl.GenericDAOImplHibernate;

/**
 *
 * @author Samuel
 */
public class LoginDAOImplHibernate extends GenericDAOImplHibernate<LoginController, Integer> implements LoginDAO{

    @Override
    public boolean findUser(String user, String pass) throws BussinessException {
        try{
            Session session = sessionFactory.getCurrentSession();
            Query query = session.createQuery("SELECT login From LoginController login where usuario like '"+user+"' and pass like '"+pass+"'");
            List<LoginController> lc = query.list();
            if(lc.size()!= 0){
                return true;
            }else return false;            
        }catch(Exception e){
            
        }
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
