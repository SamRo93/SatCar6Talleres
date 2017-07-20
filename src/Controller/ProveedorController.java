/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.util.List;
import ordenestrabajo.dao_persistencia.ProvedorDAO;
import ordenestrabajo.dao_persistencia.ProveedormostrarDAO;
import ordenestrabajo.dao_persistencia.impl.ProveedoresDAOImplHibernate;
import satcar6.entity.Provedoresmostrar;
import satcar6.entity.ProveedoresEntity;


/**
 *
 * @author Samuel
 */
public class ProveedorController {
    
    ProvedorDAO proveedorDAO;
  ProveedormostrarDAO proveedormostrarDAO;
  
  
         public ProveedorController(){
          proveedorDAO = new ProveedoresDAOImplHibernate();
        
    }
    
    public void guardar(ProveedoresEntity proveedor) throws Exception{
        proveedorDAO.saveOrUpdate(proveedor);
    }
    
    public void guardar(Provedoresmostrar proveedor) throws Exception{
        proveedormostrarDAO.saveOrUpdate(proveedor);
    }
    
    public void delete(ProveedoresEntity proveedor) throws Exception{
        proveedorDAO.delete(proveedor);
    }    

    public List<ProveedoresEntity> busquedaCliente(String text, Object dato) throws Exception {
        List<ProveedoresEntity> l = proveedorDAO.findProveedor(text, dato);
            return l;
    }
    
    public ProveedoresEntity buscarPorId(int id) throws Exception{
        return proveedorDAO.findProveedorById(id);
    }

}