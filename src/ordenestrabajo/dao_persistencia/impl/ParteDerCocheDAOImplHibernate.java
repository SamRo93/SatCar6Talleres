/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenestrabajo.dao_persistencia.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import ordenestrabajo.dao_persistencia.*;
import ordenestrabajo.presentacion.ParteDerCocheEntity;
import persistencia.dao.impl.GenericDAOImplHibernate;

/**
 *
 * @author Samuel
 */
public class ParteDerCocheDAOImplHibernate extends GenericDAOImplHibernate<ParteDerCocheEntity, Integer> implements ParteDerCocheDAO{
    @PersistenceContext
    protected EntityManager em;
}

