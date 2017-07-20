/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenestrabajo.dao_persistencia;

import java.util.List;
import persistencia.dao.GenericDAO;
import satcar6.entity.ProveedoresEntity;

/**
 *
 * @author Samuel
 */
public interface ProvedorDAO extends GenericDAO<ProveedoresEntity, Integer>{
     List<ProveedoresEntity> findProveedor(String caso, Object dato) throws Exception;
     ProveedoresEntity findProveedorById(int id) throws Exception;
     ProveedoresEntity findProveedorByName(String name) throws Exception;
     int numDB() throws Exception;
}
