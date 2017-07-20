/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.util.List;
import ordenestrabajo.dao_persistencia.OrdenmostrarDAO;
import ordenestrabajo.dao_persistencia.impl.OrdenmostrarDAOImplHibernate;
import satcar6.entity.Ordenmostrar;

/**
 *
 * @author Samuel
 */
public class OrdenmostrarController {
    private OrdenmostrarDAO ordenmostrarDAO;

    public OrdenmostrarController(){
        ordenmostrarDAO = new OrdenmostrarDAOImplHibernate();
    }
    
    public void guardarEnBD(Ordenmostrar cliente) throws Exception{
        ordenmostrarDAO.saveOrUpdate(cliente);
    }
    
    public long verDBResult() throws Exception{
        return ordenmostrarDAO.verEnDB();
    }
    
    public List<Ordenmostrar> busquedaDB (String s, Object dato) throws Exception{
        return ordenmostrarDAO.busquedaDB(s, dato);
    }
    
    public Ordenmostrar buscarPorId (int id) throws Exception{
        return ordenmostrarDAO.busquedaId(id);
    }
    public void delete(Ordenmostrar cl) throws Exception{
        ordenmostrarDAO.delete(cl);
    }
}
