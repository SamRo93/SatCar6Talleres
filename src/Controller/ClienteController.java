package Controller;

import java.util.List;
import ordenestrabajo.dao_persistencia.ClienteDAO;
import ordenestrabajo.dao_persistencia.impl.ClienteDAOImplHibernate;
import ordenestrabajo.presentacion.ClienteEntity;
import ordenestrabajo.presentacion.ClienteMostrarEntity;
import persistencia.dao.BussinessException;

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
     
    public ClienteController(){
        clienteDAO = new ClienteDAOImplHibernate();
    }
    
    public void guardar(ClienteEntity cliente) throws Exception{
        clienteDAO.saveOrUpdate(cliente);
    }
    
    public void delete(ClienteEntity client) throws Exception{
        clienteDAO.delete(client);
    }    

    public List<ClienteMostrarEntity> busquedaCliente(String text, Object dato) throws BussinessException {
        return clienteDAO.findClient(text, dato);
    }
}
