/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenestrabajo.dao_persistencia.impl;

import java.util.List;
import ordenestrabajo.dao_persistencia.ProveedormostrarDAO;
import org.hibernate.Session;
import org.hibernate.query.Query;
import persistencia.dao.impl.GenericDAOImplHibernate;
import satcar6.entity.Provedoresmostrar;
import satcar6.util.HibernateUtil;

/**
 *
 * @author Samuel
 */
public class ProveedormostrarDAOImplHibernate extends GenericDAOImplHibernate<Provedoresmostrar, Integer> implements ProveedormostrarDAO {

    @Override
    public long verEnDB() throws Exception {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        long i = (long) session.createQuery("Select Count(doc) From Clientemostrar doc").uniqueResult();
        return  i;
    }

    @Override
    public List<Provedoresmostrar> busquedaDB(String s, Object dato) throws Exception {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        String query1="Select doc from Clientemostrar doc";
            switch(s){
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
        return (List<Provedoresmostrar>) q.list();
    }

    @Override
    public Provedoresmostrar busquedaId(int id) throws Exception {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Query q = session.createQuery("Select doc From Clientemostrar doc where doc.id = '"+String.valueOf(id)+"'");
        session.getTransaction().commit();
        return (Provedoresmostrar) q.uniqueResult();
    }
    
}
