package Controller;


import ordenestrabajo.ParteIzqCoche;
import ordenestrabajo.ParteTraseraCoche;
import ordenestrabajo.dao_persistencia.ParteIzqCocheDAO;
import ordenestrabajo.dao_persistencia.impl.ParteIzqCocheDAOImplHibernate;
import satcar6.entity.Parteizqcoche;

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
    
    public void guardar(Parteizqcoche parteIzq) throws Exception{
        izqDAO.saveOrUpdate(parteIzq);
    }
    
    public void borrar(Parteizqcoche parteIzq) throws Exception{
        izqDAO.delete(parteIzq);
    }
    
    public Parteizqcoche findById(int id) throws Exception{
        return izqDAO.findById(id);
    }
    
     public Parteizqcoche findByIdReparacion(int id) throws Exception{
        return izqDAO.findByIdRepa(id);
    }
}
