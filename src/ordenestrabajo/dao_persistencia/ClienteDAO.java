/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenestrabajo.dao_persistencia;

import java.util.*;
import persistencia.dao.GenericDAO;
import satcar6.entity.Cliente;
import satcar6.entity.Clientemostrar;

/**
 *
 * @author Samuel
 */
public interface ClienteDAO extends GenericDAO<Cliente, Integer>{
     List<Cliente> findClient(String caso, Object dato) throws Exception;
     Cliente findClientById(int id) throws Exception;
     Cliente findClientByName(String name) throws Exception;
     int numDB() throws Exception;
}
