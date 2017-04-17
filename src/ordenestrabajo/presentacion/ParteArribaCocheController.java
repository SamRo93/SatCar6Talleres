/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenestrabajo.presentacion;

import ordenestrabajo.dao_persistencia.*;

/**
 *
 * @author Samuel
 */
public class ParteArribaCocheController {
    private int codigo;
    private String obsParteArriba;
    private String materialesArriba; 

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setObsParteArriba(String obsParteArriba) {
        this.obsParteArriba = obsParteArriba;
    }

    public void setMaterialesArriba(String materialesArriba) {
        this.materialesArriba = materialesArriba;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getObsParteArriba() {
        return obsParteArriba;
    }

    public String getMaterialesArriba() {
        return materialesArriba;
    }
    
}
