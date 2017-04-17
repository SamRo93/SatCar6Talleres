/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenestrabajo.presentacion;

/**
 *
 * @author Samuel
 */

public class ClienteGeneral {
   private int id;
   private String razonSocial;
   private String nombreComercial;
   private String NIF;
   private String domicilio;
   private String poblacion;
   private String CP;
   private String provincia;
   private String pais;
   private String tlf1;
   private String email;
   private String paginaWeb;
   private String fechaAlta;
   private String observaciones;
   
   ClienteGeneral(String razonSocial, String nombreComercial, String NIF, String domicilio, String poblacion, String CP, String provincia,
   String pais, String tlf1, String email, String paginaWeb, String fechaAlta, String observaciones){
   this.razonSocial=razonSocial;
   this.nombreComercial=nombreComercial;
   this.NIF=NIF;
   this.poblacion=poblacion;
   this.domicilio=domicilio;
   this.CP=CP;
   this.provincia=provincia;
   this.pais=pais;
   this.tlf1=tlf1;
   this.email=email;
   this.paginaWeb=paginaWeb;
   this.fechaAlta=fechaAlta;
   this.observaciones=observaciones;
   }
   
   public ClienteGeneral(){ 
   }

    public int getId() {
        return id;
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

    public String getDomicilio() {
        return domicilio;
    }

    public String getPoblacion() {
        return poblacion;
    }

    public String getCP() {
        return CP;
    }

    public String getProvincia() {
        return provincia;
    }

    public String getPais() {
        return pais;
    }

    public String getTlf1() {
        return tlf1;
    }

    public String getEmail() {
        return email;
    }

    public String getPaginaWeb() {
        return paginaWeb;
    }

    public String getFechaAlta() {
        return fechaAlta;
    }

    public String getObservaciones() {
        return observaciones;
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

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public void setPoblacion(String poblacion) {
        this.poblacion = poblacion;
    }

    public void setCP(String CP) {
        this.CP = CP;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public void setTlf1(String tlf1) {
        this.tlf1 = tlf1;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPaginaWeb(String paginaWeb) {
        this.paginaWeb = paginaWeb;
    }

    public void setFechaAlta(String fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
   
   
   
   
}
