/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenestrabajo.dao_persistencia;

import ordenestrabajo.ParteDelanteraCoche;
import persistencia.dao.GenericDAO;
import satcar6.entity.Parteabajocoche;
/**
 *
 * @author Samuel
 */
public interface ParteDelanteraCocheDAO extends GenericDAO<Parteabajocoche, Integer>{
    public Parteabajocoche findById(int id) throws Exception;

    public Parteabajocoche findByIdRepa(int id) throws Exception;
}
