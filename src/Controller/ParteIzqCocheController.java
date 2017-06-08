package Controller;


import ordenestrabajo.dao_persistencia.ParteIzqCocheDAO;
import ordenestrabajo.dao_persistencia.impl.ParteIzqCocheDAOImplHibernate;
import ordenestrabajo.presentacion.ParteIzqCocheEntity;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Samuel
 */
public class ParteIzqCocheController {
    ParteIzqCocheDAO izqDAO;
    
    public ParteIzqCocheController(){
        izqDAO = new ParteIzqCocheDAOImplHibernate();
    }
    
    public void guardar(ParteIzqCocheEntity parteIzq) throws Exception{
        izqDAO.saveOrUpdate(parteIzq);
    }
    
    public void borrar(ParteIzqCocheEntity parteIzq) throws Exception{
        izqDAO.delete(parteIzq);
    }
}
