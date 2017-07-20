package Controller;


import ordenestrabajo.ParteArribaCoche;
import ordenestrabajo.ParteTraseraCoche;
import ordenestrabajo.dao_persistencia.ParteTraseraCocheDAO;
import ordenestrabajo.dao_persistencia.impl.ParteTraseraCocheDAOImplHibernate;
import satcar6.entity.Partetraseracoche;

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
    
    public void guardar(Partetraseracoche parteTrasera) throws Exception{
        traseraDAO.saveOrUpdate(parteTrasera);
    }
    
    public void borrar(Partetraseracoche parteTrasera) throws Exception{
        traseraDAO.delete(parteTrasera);
    }
    
    public Partetraseracoche findById(int id) throws Exception{
        return traseraDAO.findById(id);
    }
    
    public Partetraseracoche findByIdReparacion(int id) throws Exception{
        return traseraDAO.findByIdRepa(id);
    }
            
}
