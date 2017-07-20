/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenestrabajo.dao_persistencia;

import ordenestrabajo.ParteIzqCoche;
import persistencia.dao.GenericDAO;
import satcar6.entity.Parteizqcoche;
/**
 *
 * @author Samuel
 */
public interface ParteIzqCocheDAO extends GenericDAO<Parteizqcoche, Integer>{
    public Parteizqcoche findById(int id) throws Exception;
    public Parteizqcoche findByIdRepa(int id) throws Exception;
}
