/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.util.List;
import ordenestrabajo.dao_persistencia.ProveedormostrarDAO;
import ordenestrabajo.dao_persistencia.impl.ProveedormostrarDAOImplHibernate;
import satcar6.entity.Provedoresmostrar;

/**
 *
 * @author Samuel
 */
public class ProveedormostrarController {
    private ProveedormostrarDAO proveedormostrarDAO;
    
    public ProveedormostrarController(){
        proveedormostrarDAO = new ProveedormostrarDAOImplHibernate();
    }
    
    public void guardarEnBD(Provedoresmostrar proveedor) throws Exception{
        proveedormostrarDAO.saveOrUpdate(proveedor);
    }
    
    public long verDBResult() throws Exception{
        return proveedormostrarDAO.verEnDB();
    }
    
    public List<Provedoresmostrar> busquedaDB (String s, Object dato) throws Exception{
        return proveedormostrarDAO.busquedaDB(s, dato);
    }
    
    public Provedoresmostrar buscarPorId (int id) throws Exception{
        return proveedormostrarDAO.busquedaId(id);
    }
    public void delete(Provedoresmostrar cl) throws Exception{
        proveedormostrarDAO.delete(cl);
    }
}
