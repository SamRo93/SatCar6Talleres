/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenestrabajo.dao_persistencia;

import java.util.*;
import ordenestrabajo.presentacion.Cliente;
import persistencia.dao.BussinessException;
import persistencia.dao.GenericDAO;

/**
 *
 * @author Samuel
 */
public interface ClienteDAO extends GenericDAO<Cliente, Integer>{
     List<Cliente> findByNClient(int id) throws BussinessException;
     List<Cliente> findByName(String name) throws BussinessException;
     List<Cliente> findBySocialReason(String socialReason) throws BussinessException;
     List<Cliente> findByNif(String nif) throws BussinessException;
}
