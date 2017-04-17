/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenestrabajo.presentacion;

import ordenestrabajo.dao_persistencia.*;
import ordenestrabajo.presentacion.ClienteGeneral;
import ordenestrabajo.dao_persistencia.ClienteGeneralDAO;
import persistencia.dao.BussinessException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


/**
 *
 * @author Samuel
 */
@Component
public class ClienteController {
    
    @Autowired
    ClienteGeneralDAO clienteGeneralDao;
    
    public void guardar (ClienteGeneral clienteGeneral) throws BussinessException{
        clienteGeneralDao.saveOrUpdate(clienteGeneral);
    }
}
