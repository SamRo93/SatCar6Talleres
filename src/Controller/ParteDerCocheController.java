package Controller;


import ordenestrabajo.ParteDelanteraCoche;
import ordenestrabajo.ParteDerCoche;
import ordenestrabajo.dao_persistencia.ParteDerCocheDAO;
import ordenestrabajo.dao_persistencia.impl.ParteDerCocheDAOImplHibernate;
import satcar6.entity.Partedercoche;

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
    
    public void guardar(Partedercoche parteDer) throws Exception{
        derDAO.saveOrUpdate(parteDer);
    }
    
    public void borrar(Partedercoche parteDer) throws Exception{
        derDAO.delete(parteDer);
    }
    
    public Partedercoche findById(int id) throws Exception{
        return derDAO.findById(id);
    }
    public Partedercoche findByIdReparacion(int id) throws Exception{
        return derDAO.findByIdRepa(id);
    }
}
