package Controller;


import java.util.Date;
import java.util.List;
import ordenestrabajo.dao_persistencia.ClienteDAO;
import ordenestrabajo.dao_persistencia.OrdenmostrarDAO;
import ordenestrabajo.dao_persistencia.ReparacionDAO;
import ordenestrabajo.dao_persistencia.impl.ClienteDAOImplHibernate;
import ordenestrabajo.dao_persistencia.impl.OrdenmostrarDAOImplHibernate;
import ordenestrabajo.dao_persistencia.impl.ReparacionDAOImplHibernate;
import satcar6.entity.Cliente;
import satcar6.entity.Ordenmostrar;
import satcar6.entity.ReparacionEntity;

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
    OrdenmostrarDAO ordenMostrarDAO; 
    ClienteDAO clientDAO;
    
    public ReparacionController(){
        reparacionDAO = new ReparacionDAOImplHibernate();
        ordenMostrarDAO = new OrdenmostrarDAOImplHibernate();
        clientDAO = new ClienteDAOImplHibernate();
    }
    
    public void guardar(ReparacionEntity reparacion) throws Exception{
        reparacionDAO.saveOrUpdate(reparacion);
    }
    
    public void guardar(Ordenmostrar reparacion) throws Exception{
        ordenMostrarDAO.saveOrUpdate(reparacion);
    }
    
    public Cliente buscarCliente(int id) throws Exception{
        return clientDAO.findClientById(id);
    }
    
    public List<ReparacionEntity> buscar(Cliente client) throws Exception{
        return reparacionDAO.findByClient(client.getId());
    }
    
    public List<ReparacionEntity> buscar(Date fechaini, Date fechafin ) throws Exception{
        return reparacionDAO.findByFecha(fechaini, fechafin);
    }
    
    public ReparacionEntity buscar(int Rep) throws Exception{
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
