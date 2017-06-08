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
@Table(name="partearribacoche")
public class ParteArribaCocheEntity {
    
    @Id
    @Column(name="id")
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;
    
    @Column(name="obsParteArriba")
    private String obsParteArriba;
    @Column(name="materialesArriba")
    private String materialesArriba; 

    public void setId(int id) {
        this.id = id;
    }

    public void setObsParteArriba(String obsParteArriba) {
        this.obsParteArriba = obsParteArriba;
    }

    public void setMaterialesArriba(String materialesArriba) {
        this.materialesArriba = materialesArriba;
    }

    public int getId() {
        return id;
    }

    public String getObsParteArriba() {
        return obsParteArriba;
    }

    public String getMaterialesArriba() {
        return materialesArriba;
    }
    
}
