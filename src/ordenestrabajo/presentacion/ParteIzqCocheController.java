/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenestrabajo.presentacion;

import javax.persistence.*;
import ordenestrabajo.dao_persistencia.*;

/**
 *
 * @author Samuel
 */
@Entity
@Table(name="parteizqcoche")
public class ParteIzqCocheController {

    @Id
    @Column(name="id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    
    @Column(name="obsParteIzq")
    private String obsParteIzq;
    @Column(name="materialesIzq")
    private String materialesIzq;

    public void setId(int id) {
        this.id = id;
    }

    public void setObsParteIzq(String obsParteIzq) {
        this.obsParteIzq = obsParteIzq;
    }

    public void setMaterialesIzq(String materialesIzq) {
        this.materialesIzq = materialesIzq;
    }

    public int getId() {
        return id;
    }

    public String getObsParteIzq() {
        return obsParteIzq;
    }

    public String getMaterialesIzq() {
        return materialesIzq;
    }
    
}
