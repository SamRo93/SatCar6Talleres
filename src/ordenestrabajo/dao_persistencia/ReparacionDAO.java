/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenestrabajo.dao_persistencia;


import java.util.Date;
import java.util.List;
import ordenestrabajo.presentacion.Cliente;
import ordenestrabajo.presentacion.ReparacionController;
import persistencia.dao.BussinessException;
import persistencia.dao.GenericDAO;
/**
 *
 * @author Samuel
 */
public interface ReparacionDAO extends GenericDAO<ReparacionController, Integer>{
    List<ReparacionController> findById(int id ) throws BussinessException;
    List<ReparacionController> findByClient(int client) throws BussinessException;
    List<ReparacionController> findByMatricula(String matricula) throws BussinessException;
    List<ReparacionController> findByMarca(String marca) throws BussinessException;
    List<ReparacionController> findByFecha(Date fechaIncial,Date fechaFinal) throws BussinessException;
}
