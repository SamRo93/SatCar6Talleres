package Controller;


import java.util.Date;
import java.util.List;
import ordenestrabajo.dao_persistencia.ReparacionDAO;
import ordenestrabajo.dao_persistencia.impl.ReparacionDAOImplHibernate;
import ordenestrabajo.presentacion.ClienteEntity;
import ordenestrabajo.presentacion.ReparacionEntity;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Samuel
 */
public class ReparacionController {
    ReparacionDAO reparacionDAO;
    
    public ReparacionController(){
        reparacionDAO = new ReparacionDAOImplHibernate();
    }
    
    public void guardar(ReparacionEntity reparacion) throws Exception{
        reparacionDAO.saveOrUpdate(reparacion);
    }
    
    public List<ReparacionEntity> buscar(ClienteEntity client) throws Exception{
        return reparacionDAO.findByClient(client.getId());
    }
    
    public List<ReparacionEntity> buscar(Date fechaini, Date fechafin ) throws Exception{
        return reparacionDAO.findByFecha(fechaini, fechafin);
    }
    
    public List<ReparacionEntity> buscar(int Rep) throws Exception{
        return reparacionDAO.findById(Rep);
    }
    
    public List<ReparacionEntity> buscar(String marcaOMatricula) throws Exception{
        
        List<ReparacionEntity> repa;
        
        if(marcaOMatricula.contains("-")){
            repa = reparacionDAO.findByMatricula(marcaOMatricula);
        }else {
        repa = reparacionDAO.findByMarca(marcaOMatricula);
        }
        return repa;
    }
    
    public void borrar(ReparacionEntity reparacion) throws Exception{
        reparacionDAO.delete(reparacion);
    }
}
