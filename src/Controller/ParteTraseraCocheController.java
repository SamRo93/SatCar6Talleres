package Controller;


import ordenestrabajo.dao_persistencia.ParteTraseraCocheDAO;
import ordenestrabajo.dao_persistencia.impl.ParteTraseraCocheDAOImplHibernate;
import ordenestrabajo.presentacion.ParteTraseraCocheEntity;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Samuel
 */
public class ParteTraseraCocheController {
    
    ParteTraseraCocheDAO traseraDAO;
    
    public ParteTraseraCocheController(){
        traseraDAO = new ParteTraseraCocheDAOImplHibernate();
    }    
    
    public void guardar(ParteTraseraCocheEntity parteTrasera) throws Exception{
        traseraDAO.saveOrUpdate(parteTrasera);
    }
    
    public void borrar(ParteTraseraCocheEntity parteTrasera) throws Exception{
        traseraDAO.delete(parteTrasera);
    }
}
