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
public class ParteIzqCocheController {
    private int codigo;
    private String obsParteIzq;
    private String materialesIzq;

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setObsParteIzq(String obsParteIzq) {
        this.obsParteIzq = obsParteIzq;
    }

    public void setMaterialesIzq(String materialesIzq) {
        this.materialesIzq = materialesIzq;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getObsParteIzq() {
        return obsParteIzq;
    }

    public String getMaterialesIzq() {
        return materialesIzq;
    }
    
}
