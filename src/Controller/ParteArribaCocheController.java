package Controller;


import ordenestrabajo.dao_persistencia.ParteArribaCocheDAO;
import ordenestrabajo.dao_persistencia.impl.ParteArribaCocheDAOImplHibernate;
import ordenestrabajo.presentacion.ParteArribaCocheEntity;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Samuel
 */
public class ParteArribaCocheController {
    
    ParteArribaCocheDAO arribaDAO;
    
    public ParteArribaCocheController(){
        arribaDAO = new ParteArribaCocheDAOImplHibernate();
    }
    
    public void guardar(ParteArribaCocheEntity parteArriba) throws Exception{
        arribaDAO.saveOrUpdate(parteArriba);
    }
    
     public void borrar(ParteArribaCocheEntity parteArriba) throws Exception{
        arribaDAO.delete(parteArriba);
    }
    
}
