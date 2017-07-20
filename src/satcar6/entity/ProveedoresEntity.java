package satcar6.entity;
// Generated 11-jul-2017 20:30:24 by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * Proveedores generated by hbm2java
 */
public class ProveedoresEntity  implements java.io.Serializable {


     private Integer id;
     private String razonsocial;
     private String nombrecomercial;
     private String nif;
     private String domicilio;
     private String poblacion;
     private String codigopostal;
     private String provincia;
     private String pais;
     private String telefono;
     private String email;
     private String paginaweb;
     private Date fechaalta;
     private String observaciones;

    public ProveedoresEntity() {
    }

    public ProveedoresEntity(String razonsocial, String nombrecomercial, String nif, String domicilio, String poblacion, String codigopostal, String provincia, String pais, String telefono, String email, String paginaweb, Date fechaalta, String observaciones) {
       this.razonsocial = razonsocial;
       this.nombrecomercial = nombrecomercial;
       this.nif = nif;
       this.domicilio = domicilio;
       this.poblacion = poblacion;
       this.codigopostal = codigopostal;
       this.provincia = provincia;
       this.pais = pais;
       this.telefono = telefono;
       this.email = email;
       this.paginaweb = paginaweb;
       this.fechaalta = fechaalta;
       this.observaciones = observaciones;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
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
    public String getDomicilio() {
        return this.domicilio;
    }
    
    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }
    public String getPoblacion() {
        return this.poblacion;
    }
    
    public void setPoblacion(String poblacion) {
        this.poblacion = poblacion;
    }
    public String getCodigopostal() {
        return this.codigopostal;
    }
    
    public void setCodigopostal(String codigopostal) {
        this.codigopostal = codigopostal;
    }
    public String getProvincia() {
        return this.provincia;
    }
    
    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }
    public String getPais() {
        return this.pais;
    }
    
    public void setPais(String pais) {
        this.pais = pais;
    }
    public String getTelefono() {
        return this.telefono;
    }
    
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPaginaweb() {
        return this.paginaweb;
    }
    
    public void setPaginaweb(String paginaweb) {
        this.paginaweb = paginaweb;
    }
    public Date getFechaalta() {
        return this.fechaalta;
    }
    
    public void setFechaalta(Date fechaalta) {
        this.fechaalta = fechaalta;
    }
    public String getObservaciones() {
        return this.observaciones;
    }
    
    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }




}


