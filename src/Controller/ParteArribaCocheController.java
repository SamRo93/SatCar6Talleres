package Controller;


import ordenestrabajo.ParteArribaCoche;
import ordenestrabajo.ParteDerCoche;
import ordenestrabajo.dao_persistencia.ParteArribaCocheDAO;
import ordenestrabajo.dao_persistencia.impl.ParteArribaCocheDAOImplHibernate;
import satcar6.entity.Partearribacoche;

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
    
    public void guardar(Partearribacoche parteArriba) throws Exception{
        arribaDAO.saveOrUpdate(parteArriba);
    }
    
     public void borrar(Partearribacoche parteArriba) throws Exception{
        arribaDAO.delete(parteArriba);
    }

    public Partearribacoche findById(int id) throws Exception {
        return arribaDAO.findById(id);
    }
    
    public Partearribacoche findByIdReparacion(int id) throws Exception {
        return arribaDAO.findByIdRepa(id);
    }
}
