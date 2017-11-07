/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenestrabajo.dao_persistencia;

import java.util.List;
import persistencia.dao.GenericDAO;
import satcar6.entity.Ordenmostrar;

/**
 *
 * @author Samuel
 */
public interface OrdenmostrarDAO extends GenericDAO<Ordenmostrar, Integer>{
    List<Long> verEnDB() throws Exception;
    List<Ordenmostrar> busquedaDB(String s, Object dato) throws Exception;
    Ordenmostrar busquedaId(int id) throws Exception;
}
