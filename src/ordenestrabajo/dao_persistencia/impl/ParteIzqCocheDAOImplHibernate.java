/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenestrabajo.dao_persistencia.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import ordenestrabajo.ParteIzqCoche;
import ordenestrabajo.dao_persistencia.*;
import org.hibernate.Session;
import org.hibernate.query.Query;
import persistencia.dao.impl.GenericDAOImplHibernate;
import satcar6.entity.Parteizqcoche;
import satcar6.util.HibernateUtil;

/**
 *
 * @author Samuel
 */
public class ParteIzqCocheDAOImplHibernate extends GenericDAOImplHibernate<Parteizqcoche, Integer> implements ParteIzqCocheDAO{

    @Override
    public Parteizqcoche findById(int id) throws Exception {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Query q = session.createQuery("Select doc From Clientemostrar doc where doc.id = '"+String.valueOf(id)+"'");
        session.getTransaction().commit();
        return (Parteizqcoche) q.uniqueResult();
    }

    @Override
    public Parteizqcoche findByIdRepa(int id) throws Exception {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Query q = session.createQuery("Select doc From Clientemostrar doc where doc.idCliente = '"+String.valueOf(id)+"'");
        session.getTransaction().commit();
        return (Parteizqcoche) q.uniqueResult();
    }
}

