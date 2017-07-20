/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.util.List;
import ordenestrabajo.dao_persistencia.ClientemostrarDAO;
import ordenestrabajo.dao_persistencia.impl.ClientemostrarDAOImplHibernate;
import satcar6.entity.Clientemostrar;

/**
 *
 * @author Samuel
 */
public class ClientemostrarController {

    private ClientemostrarDAO clientemostrarDAO;

    public ClientemostrarController(){
        clientemostrarDAO = new ClientemostrarDAOImplHibernate();
    }
    
    public void guardarEnBD(Clientemostrar cliente) throws Exception{
        clientemostrarDAO.saveOrUpdate(cliente);
    }
    
    public long verDBResult() throws Exception{
        return clientemostrarDAO.verEnDB();
    }
    
    public List<Clientemostrar> busquedaDB (String s, Object dato) throws Exception{
        return clientemostrarDAO.busquedaDB(s, dato);
    }
    
    public Clientemostrar buscarPorId (int id) throws Exception{
        return clientemostrarDAO.busquedaId(id);
    }
    public void delete(Clientemostrar cl) throws Exception{
        clientemostrarDAO.delete(cl);
    }
}
