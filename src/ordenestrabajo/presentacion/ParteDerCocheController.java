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
public class ParteDerCocheController {
    private int codigo;
    private String obsParteDer;
    private String materialesDer;

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setObsParteDer(String obsParteDer) {
        this.obsParteDer = obsParteDer;
    }

    public void setMaterialesDer(String materialesDer) {
        this.materialesDer = materialesDer;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getObsParteDer() {
        return obsParteDer;
    }

    public String getMaterialesDer() {
        return materialesDer;
    }
}
