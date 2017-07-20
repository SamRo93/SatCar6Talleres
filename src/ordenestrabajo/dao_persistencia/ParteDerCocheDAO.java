/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenestrabajo.dao_persistencia;

import ordenestrabajo.ParteDerCoche;
import persistencia.dao.GenericDAO;
import satcar6.entity.Partedercoche;
/**
 *
 * @author Samuel
 */
public interface ParteDerCocheDAO extends GenericDAO<Partedercoche, Integer>{
    public Partedercoche findById(int id) throws Exception;
    public Partedercoche findByIdRepa(int id) throws Exception;
}
