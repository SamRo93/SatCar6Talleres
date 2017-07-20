/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenestrabajo.dao_persistencia;

import java.util.List;
import persistencia.dao.GenericDAO;
import satcar6.entity.Clientemostrar;

/**
 *
 * @author Samuel
 */
public interface ClientemostrarDAO extends GenericDAO<Clientemostrar, Integer>{
    long verEnDB() throws Exception;
    List<Clientemostrar> busquedaDB(String s, Object dato) throws Exception;
    Clientemostrar busquedaId(int id) throws Exception;
}
