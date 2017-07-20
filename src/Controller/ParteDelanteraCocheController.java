package Controller;


import ordenestrabajo.ParteDelanteraCoche;
import ordenestrabajo.ParteIzqCoche;
import ordenestrabajo.dao_persistencia.ParteDelanteraCocheDAO;
import ordenestrabajo.dao_persistencia.impl.ParteDelanteraCocheDAOImplHibernate;
import satcar6.entity.Parteabajocoche;

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
    
    public void guardar(Parteabajocoche parteDelantera) throws Exception{
        delanteraDAO.saveOrUpdate(parteDelantera);
    }
    
     public void borrar(Parteabajocoche parteDelantera) throws Exception{
        delanteraDAO.delete(parteDelantera);
    }
     
    public Parteabajocoche findById(int id) throws Exception{
        return delanteraDAO.findById(id);
    }
    
    public Parteabajocoche findByIdReparacion(int id) throws Exception{
        return delanteraDAO.findByIdRepa(id);
    }
}
