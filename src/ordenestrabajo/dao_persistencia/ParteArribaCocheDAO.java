/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenestrabajo.dao_persistencia;

import ordenestrabajo.ParteArribaCoche;
import persistencia.dao.GenericDAO;
import satcar6.entity.Partearribacoche;
/**
 *
 * @author Samuel
 */
public interface ParteArribaCocheDAO extends GenericDAO<Partearribacoche, Integer>{
    public Partearribacoche findById(int id) throws Exception;

    public Partearribacoche findByIdRepa(int id) throws Exception;
    
}
