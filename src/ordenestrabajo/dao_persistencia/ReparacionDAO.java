/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenestrabajo.dao_persistencia;


import java.util.Date;
import java.util.List;
import ordenestrabajo.presentacion.ClienteEntity;
import ordenestrabajo.presentacion.ReparacionEntity;
import persistencia.dao.BussinessException;
import persistencia.dao.GenericDAO;
/**
 *
 * @author Samuel
 */
public interface ReparacionDAO extends GenericDAO<ReparacionEntity, Integer>{
    List<ReparacionEntity> findById(int id ) throws BussinessException;
    List<ReparacionEntity> findByClient(int client) throws BussinessException;
    List<ReparacionEntity> findByMatricula(String matricula) throws BussinessException;
    List<ReparacionEntity> findByMarca(String marca) throws BussinessException;
    List<ReparacionEntity> findByFecha(Date fechaIncial,Date fechaFinal) throws BussinessException;
}
