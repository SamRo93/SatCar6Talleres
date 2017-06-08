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
@Table(name="partetraseracoche")
public class ParteTraseraCocheEntity {
    
     @Id
    @Column(name="id")
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;
     
    @Column(name="obsParteTrasera") 
    private String obsParteTrasera;
    @Column(name="materialesTrasera")
    private String materialesTrasera;

    public void setId(int id) {
        this.id = id;
    }

    public void setObsParteTrasera(String obsParteTrasera) {
        this.obsParteTrasera = obsParteTrasera;
    }

    public void setMaterialesTrasera(String materialesTrasera) {
        this.materialesTrasera = materialesTrasera;
    }

    public int getId() {
        return id;
    }

    public String getObsParteTrasera() {
        return obsParteTrasera;
    }

    public String getMaterialesTrasera() {
        return materialesTrasera;
    }
}
