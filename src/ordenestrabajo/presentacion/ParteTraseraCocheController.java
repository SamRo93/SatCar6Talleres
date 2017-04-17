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
public class ParteTraseraCocheController {
     private int codigo;
    private String obsParteTrasera;
    private String materialesTrasera;

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setObsParteTrasera(String obsParteTrasera) {
        this.obsParteTrasera = obsParteTrasera;
    }

    public void setMaterialesTrasera(String materialesTrasera) {
        this.materialesTrasera = materialesTrasera;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getObsParteTrasera() {
        return obsParteTrasera;
    }

    public String getMaterialesTrasera() {
        return materialesTrasera;
    }
}
