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
public class ParteDelanteraCocheController {
 private int codigo;
    private String obsParteDelantera;
    private String materialesDelantera;

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setObsParteDelantera(String obsParteDelantera) {
        this.obsParteDelantera = obsParteDelantera;
    }

    public void setMaterialesDelantera(String materialesDelantera) {
        this.materialesDelantera = materialesDelantera;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getObsParteDelantera() {
        return obsParteDelantera;
    }

    public String getMaterialesDelantera() {
        return materialesDelantera;
    }   
}
