package satcar6.entity;
// Generated 11-jul-2017 20:30:24 by Hibernate Tools 4.3.1



/**
 * Clientemostrar generated by hbm2java
 */
public class Clientemostrar  implements java.io.Serializable {


     private Integer id;
     private Integer idcliente;
     private String razonSocial;
     private String nombreComercial;
     private String nif;
     private String poblacion;
     private String tlf;

    public Clientemostrar() {
    }

    public Clientemostrar(Integer idcliente, String razonSocial, String nombreComercial, String nif, String poblacion, String tlf) {
       this.idcliente = idcliente;
       this.razonSocial = razonSocial;
       this.nombreComercial = nombreComercial;
       this.nif = nif;
       this.poblacion = poblacion;
       this.tlf = tlf;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public Integer getIdcliente() {
        return this.idcliente;
    }
    
    public void setIdcliente(Integer idcliente) {
        this.idcliente = idcliente;
    }
    public String getRazonSocial() {
        return this.razonSocial;
    }
    
    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }
    public String getNombreComercial() {
        return this.nombreComercial;
    }
    
    public void setNombreComercial(String nombreComercial) {
        this.nombreComercial = nombreComercial;
    }
    public String getNif() {
        return this.nif;
    }
    
    public void setNif(String nif) {
        this.nif = nif;
    }
    public String getPoblacion() {
        return this.poblacion;
    }
    
    public void setPoblacion(String poblacion) {
        this.poblacion = poblacion;
    }
    public String getTlf() {
        return this.tlf;
    }
    
    public void setTlf(String tlf) {
        this.tlf = tlf;
    }




}


