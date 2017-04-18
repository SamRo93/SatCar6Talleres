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
@Table(name="partedercoche")
public class ParteDerCocheController {
    
    @Id
    @Column(name="id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    
    @Column(name="obsParteDer")
    private String obsParteDer;
    @Column(name="materialesDer")
    private String materialesDer;

    public void setID(int id) {
        this.id = id;
    }

    public void setObsParteDer(String obsParteDer) {
        this.obsParteDer = obsParteDer;
    }

    public void setMaterialesDer(String materialesDer) {
        this.materialesDer = materialesDer;
    }

    public int getId() {
        return id;
    }

    public String getObsParteDer() {
        return obsParteDer;
    }

    public String getMaterialesDer() {
        return materialesDer;
    }
}
