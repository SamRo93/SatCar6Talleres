/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenestrabajo.dao_persistencia;

import java.util.*;
import ordenestrabajo.presentacion.ClienteEntity;
import ordenestrabajo.presentacion.ClienteMostrarEntity;
import persistencia.dao.BussinessException;
import persistencia.dao.GenericDAO;

/**
 *
 * @author Samuel
 */
public interface ClienteDAO extends GenericDAO<ClienteEntity, Integer>{
     List<ClienteMostrarEntity> findClient(String caso, Object dato) throws BussinessException;
}
