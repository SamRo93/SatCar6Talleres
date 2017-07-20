/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenestrabajo.dao_persistencia.impl;

import ordenestrabajo.ParteArribaCoche;
import ordenestrabajo.dao_persistencia.*;
import org.hibernate.Session;
import org.hibernate.query.Query;
import persistencia.dao.impl.GenericDAOImplHibernate;
import satcar6.entity.Partearribacoche;
import satcar6.util.HibernateUtil;

/**
 *
 * @author Samuel
 */
public class ParteArribaCocheDAOImplHibernate extends GenericDAOImplHibernate<Partearribacoche, Integer> implements ParteArribaCocheDAO{

    @Override
    public Partearribacoche findById(int id) throws Exception {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Query q = session.createQuery("Select doc From Clientemostrar doc where doc.id = '"+String.valueOf(id)+"'");
        session.getTransaction().commit();
        return (Partearribacoche) q.uniqueResult();
    }

    @Override
    public Partearribacoche findByIdRepa(int id) throws Exception {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Query q = session.createQuery("Select doc From Clientemostrar doc where doc.idCliente = '"+String.valueOf(id)+"'");
        session.getTransaction().commit();
        return (Partearribacoche) q.uniqueResult();
    }
}
