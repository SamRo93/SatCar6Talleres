package satcar6.entity;
// Generated 11-jul-2017 20:30:24 by Hibernate Tools 4.3.1



/**
 * Provedoresmostrar generated by hbm2java
 */
public class Provedoresmostrar  implements java.io.Serializable {


     private Integer id;
     private Integer idcliente;
     private String razonsocial;
     private String nombrecomercial;
     private String nif;
     private String poblacion;
     private String telefono;

    public Provedoresmostrar() {
    }

    public Provedoresmostrar(Integer idcliente, String razonsocial, String nombrecomercial, String nif, String poblacion, String telefono) {
       this.idcliente = idcliente;
       this.razonsocial = razonsocial;
       this.nombrecomercial = nombrecomercial;
       this.nif = nif;
       this.poblacion = poblacion;
       this.telefono = telefono;
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
    public String getRazonsocial() {
        return this.razonsocial;
    }
    
    public void setRazonsocial(String razonsocial) {
        this.razonsocial = razonsocial;
    }
    public String getNombrecomercial() {
        return this.nombrecomercial;
    }
    
    public void setNombrecomercial(String nombrecomercial) {
        this.nombrecomercial = nombrecomercial;
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
    public String getTelefono() {
        return this.telefono;
    }
    
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }




}

