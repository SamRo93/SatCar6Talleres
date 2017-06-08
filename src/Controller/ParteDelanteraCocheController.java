package Controller;


import ordenestrabajo.dao_persistencia.ParteDelanteraCocheDAO;
import ordenestrabajo.dao_persistencia.impl.ParteDelanteraCocheDAOImplHibernate;
import ordenestrabajo.presentacion.ParteDelanteraCocheEntity;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Samuel
 */
public class ParteDelanteraCocheController {
     ParteDelanteraCocheDAO delanteraDAO;
    
    public ParteDelanteraCocheController(){
        delanteraDAO = new ParteDelanteraCocheDAOImplHibernate();
    }
    
    public void guardar(ParteDelanteraCocheEntity parteDelantera) throws Exception{
        delanteraDAO.saveOrUpdate(parteDelantera);
    }
    
     public void borrar(ParteDelanteraCocheEntity parteDelantera) throws Exception{
        delanteraDAO.delete(parteDelantera);
    }
    
    
}
