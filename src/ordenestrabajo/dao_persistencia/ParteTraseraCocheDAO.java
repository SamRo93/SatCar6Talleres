/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenestrabajo.dao_persistencia;

import ordenestrabajo.ParteTraseraCoche;
import persistencia.dao.GenericDAO;
import satcar6.entity.Partetraseracoche;
/**
 *
 * @author Samuel
 */
public interface ParteTraseraCocheDAO extends GenericDAO<Partetraseracoche, Integer>{
    public Partetraseracoche findById(int id) throws Exception;
    public Partetraseracoche findByIdRepa(int id) throws Exception;
}
