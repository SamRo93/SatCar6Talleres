package Controller;


import ordenestrabajo.dao_persistencia.ParteDerCocheDAO;
import ordenestrabajo.dao_persistencia.impl.ParteDerCocheDAOImplHibernate;
import ordenestrabajo.presentacion.ParteDerCocheEntity;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Samuel
 */
public class ParteDerCocheController {
    
    ParteDerCocheDAO derDAO;
    
    public ParteDerCocheController(){
        derDAO = new ParteDerCocheDAOImplHibernate();
    }
    
    public void guardar(ParteDerCocheEntity parteDer) throws Exception{
        derDAO.saveOrUpdate(parteDer);
    }
    
    public void borrar(ParteDerCocheEntity parteDer) throws Exception{
        derDAO.delete(parteDer);
    }
    
}
