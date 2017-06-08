/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenestrabajo.presentacion;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.*;

/**
 *
 * @author Samuel
 */
@Entity
@Table(name="cliente")

public class ClienteMostrarEntity implements Serializable{
    
    @Id
    @Column(name="id")
    private int id;
   @Column(name="razonSocial")
   private String razonSocial;
   @Column(name="nombreComercial")
   private String nombreComercial;
   @Column(name="NIF")
   private String NIF;
   @Column(name="poblacion")
   private String poblacion;
   @Column(name="tlf1")
   private String tlf1;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

        public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public void setNombreComercial(String nombreComercial) {
        this.nombreComercial = nombreComercial;
    }

    public void setNIF(String NIF) {
        this.NIF = NIF;
    }

    public void setPoblacion(String poblacion) {
        this.poblacion = poblacion;
    }

    public void setTlf1(String tlf1) {
        this.tlf1 = tlf1;
    }


    public String getRazonSocial() {
        return razonSocial;
    }

    public String getNombreComercial() {
        return nombreComercial;
    }

    public String getNIF() {
        return NIF;
    }

    public String getPoblacion() {
        return poblacion;
    }


    public String getTlf1() {
        return tlf1;
    }

}
