/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenestrabajo.dao_persistencia.impl;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import ordenestrabajo.dao_persistencia.ClienteDAO;
import ordenestrabajo.presentacion.ClienteEntity;
import ordenestrabajo.presentacion.ClienteMostrarEntity;
import org.hibernate.Session;
import persistencia.dao.BussinessException;
import persistencia.dao.impl.GenericDAOImplHibernate;


/**
 *
 * @author samuel.romero
 */

public class ClienteDAOImplHibernate extends GenericDAOImplHibernate<ClienteEntity, Integer> implements ClienteDAO {
    
    @PersistenceContext
    protected EntityManager em;
    
    @Override
    public List<ClienteMostrarEntity> findClient(String caso, Object dato) throws BussinessException {
        String query1="Select a.id as id, a.razonSocial as razonSocial, a.nombreComercial as nombreComercial, a.poblacion as poblacion, a.tlf1 as tlf1, a.NIF as NIF from ClienteMostrarEntity a";
        try{
            switch(caso){
            case "Codigo Cliente": query1 = query1 + " where a.id like '%" + dato.toString()+ "%'";
            break;
            case "Razón Social": query1 = query1 + " where a.razonSocial like '%" + dato.toString() + "%'";
            break;
            case "Nombre Comercial": query1 = query1 + " where a.nombreComercial like '%" + dato.toString() + "%'";
            break;
            case "Población": query1 = query1 + " where a.poblacion like '%" + dato.toString() + "%'";
            break;
            case "CIF": query1 = query1 + " where a.NIF like '%" +dato.toString()+ "%'";
            break;
            default:break;
        }
            Session session = sessionFactory.getCurrentSession();
            return (List<ClienteMostrarEntity>) em.createQuery(query1).getResultList();
        }catch(Exception e){
            
        }
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
