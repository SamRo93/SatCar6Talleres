/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenestrabajo.dao_persistencia;

import java.util.List;
import persistencia.dao.GenericDAO;
import satcar6.entity.Provedoresmostrar;

/**
 *
 * @author Samuel
 */
public interface ProveedormostrarDAO extends GenericDAO<Provedoresmostrar, Integer>{
    long verEnDB() throws Exception;
    List<Provedoresmostrar> busquedaDB(String s, Object dato) throws Exception;
    Provedoresmostrar busquedaId(int id) throws Exception;
}
