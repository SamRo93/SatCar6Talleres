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
@Table(name="partedelanteracoche")
public class ParteDelanteraCocheEntity {
    
    @Id
    @Column(name="id")
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;
    
    @Column(name="obsParteDelantera")
    private String obsParteDelantera;
    @Column(name="materialesDelantera")
    private String materialesDelantera;

    public void setId(int id) {
        this.id = id;
    }

    public void setObsParteDelantera(String obsParteDelantera) {
        this.obsParteDelantera = obsParteDelantera;
    }

    public void setMaterialesDelantera(String materialesDelantera) {
        this.materialesDelantera = materialesDelantera;
    }

    public int getId() {
        return id;
    }

    public String getObsParteDelantera() {
        return obsParteDelantera;
    }

    public String getMaterialesDelantera() {
        return materialesDelantera;
    }   
}
