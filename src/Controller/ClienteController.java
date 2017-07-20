package Controller;

import java.util.List;
import ordenestrabajo.dao_persistencia.ClienteDAO;
import ordenestrabajo.dao_persistencia.ClientemostrarDAO;
import ordenestrabajo.dao_persistencia.impl.ClienteDAOImplHibernate;
import satcar6.entity.Cliente;
import satcar6.entity.Clientemostrar;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Samuel
 */
public class ClienteController {
    
   ClienteDAO clienteDAO;
   ClientemostrarDAO clientemostrarDAO;
    
    public ClienteController(){
        clienteDAO = new ClienteDAOImplHibernate();
        
    }
    
    public void guardar(Cliente cliente) throws Exception{
        clienteDAO.saveOrUpdate(cliente);
    }
    
    public void guardar(Clientemostrar cliente) throws Exception{
        clientemostrarDAO.saveOrUpdate(cliente);
    }
    
    public void delete(Cliente client) throws Exception{
        clienteDAO.delete(client);
    }    

    public List<Cliente> busquedaCliente(String text, Object dato) throws Exception {
        List<Cliente> l = clienteDAO.findClient(text, dato);
            return l;
    }
    
    public Cliente buscarPorId(int id) throws Exception{
        return clienteDAO.findClientById(id);
    }

}
