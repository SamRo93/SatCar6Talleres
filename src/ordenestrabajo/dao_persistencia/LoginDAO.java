/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenestrabajo.dao_persistencia;

import ordenestrabajo.presentacion.LoginEntity;
import persistencia.dao.BussinessException;
import persistencia.dao.GenericDAO;

/**
 *
 * @author Samuel
 */
public interface LoginDAO extends GenericDAO<LoginEntity, Integer>{
    boolean findUser(String user, String pass) throws BussinessException;
}
