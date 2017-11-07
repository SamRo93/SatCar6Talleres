/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenestrabajo.dao_persistencia.impl;

import java.util.List;
import ordenestrabajo.dao_persistencia.OrdenmostrarDAO;
import org.hibernate.Session;
import org.hibernate.query.Query;
import persistencia.dao.impl.GenericDAOImplHibernate;
import satcar6.entity.Ordenmostrar;
import satcar6.util.HibernateUtil;

/**
 *
 * @author Samuel
 */
public class OrdenmostrarDAOImplHibernate extends GenericDAOImplHibernate<Ordenmostrar, Integer> implements OrdenmostrarDAO{

	/**
	 *
	 * @return
	 * @throws Exception
	 */
	@Override
    @SuppressWarnings("null")
    public List<Long> verEnDB() throws Exception {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
      Query q =  session.createQuery("Select Count(doc) From Ordenmostrar doc");
	  session.getTransaction().commit();
	  return (List<Long>) q.list();
    }

    @Override
    public List<Ordenmostrar> busquedaDB(String s, Object dato) throws Exception {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        String query1="Select doc from Ordentemostrar doc";
            switch(s){
            case "Nº Reparacion": query1 = query1 + " where doc.id like '%" + dato.toString()+ "%'";
            break;
            case "Fecha": query1 = query1 + " where doc.fecha like '%" + dato.toString() + "%'";
            break;
            case "Cliente": query1 = query1 + " where doc.idcliente like '%" + dato.toString() + "%'";
            break;
            case "Marca": query1 = query1 + " where doc.marca like '%" + dato.toString() + "%'";
            break;
            case "Modelo": query1 = query1 + " where doc.modelo like '%" +dato.toString()+ "%'";
            break;
            default:break;
            }
        Query q = session.createQuery(query1);
        session.getTransaction().commit();
        return (List<Ordenmostrar>) q.list();
    }

    @Override
    public Ordenmostrar busquedaId(int id) throws Exception {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Query q = session.createQuery("Select doc From Ordenmostrar doc where doc.id = '"+String.valueOf(id)+"'");
        session.getTransaction().commit();
        return (Ordenmostrar) q.uniqueResult();
    }
    
}
