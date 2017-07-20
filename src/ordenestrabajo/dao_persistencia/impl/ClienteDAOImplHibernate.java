/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenestrabajo.dao_persistencia.impl;

import java.util.List;
import ordenestrabajo.dao_persistencia.ClienteDAO;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;
import persistencia.dao.impl.GenericDAOImplHibernate;
import satcar6.entity.Cliente;
import satcar6.entity.Clientemostrar;
import satcar6.util.HibernateUtil;


/**
 *
 * @author samuel.romero
 */
public class ClienteDAOImplHibernate extends GenericDAOImplHibernate<Cliente, Integer> implements ClienteDAO {
    
    @Override
    public List<Cliente> findClient(String caso, Object dato) throws Exception {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        String query1="Select doc from Cliente doc";
            switch(caso){
            case "Codigo Cliente": query1 = query1 + " where doc.id like '%" + dato.toString()+ "%'";
            break;
            case "Razón Social": query1 = query1 + " where doc.razonSocial like '%" + dato.toString() + "%'";
            break;
            case "Nombre Comercial": query1 = query1 + " where doc.nombreComercial like '%" + dato.toString() + "%'";
            break;
            case "Población": query1 = query1 + " where doc.poblacion like '%" + dato.toString() + "%'";
            break;
            case "CIF": query1 = query1 + " where doc.Nif like '%" +dato.toString()+ "%'";
            break;
            default:break;
            }
        Query q = session.createQuery(query1);
        session.getTransaction().commit();
        return (List<Cliente>) q.list();
    }

    @Override
    public Cliente findClientById(int id) throws Exception {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Query q = session.createQuery("Select doc From Cliente doc where doc.id = '"+String.valueOf(id)+"'");
        session.getTransaction().commit();
        return (Cliente) q.uniqueResult();
    }

    @Override
    public int numDB() throws Exception {
        Session session = HibernateUtil.getSessionFactory().openSession();
         session.beginTransaction();
        Query q = session.createQuery("Select Count (doc) From Cliente doc;");
        session.getTransaction().commit();
        return q.getFirstResult();
    }

    @Override
    public Cliente findClientByName(String name) throws Exception {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Query q = session.createQuery("Select doc From Cliente doc where doc.razonSocial like '%" + name + "%'");
        session.getTransaction().commit();
        return (Cliente) q.uniqueResult();
    }
}
