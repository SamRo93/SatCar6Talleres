/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenestrabajo.presentacion;

import javax.persistence.*;

/**
 *
 * @author Samuel
 */
@Entity
@Table(name="clientedtoscomerciales")
public class ClienteDtosComerciales {
    
     @Id
    @Column(name="id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
     
    @Column(name="tipoPVP")
    private String tipoPVP;
    @Column(name="dtoArticulo")
    private String dtoArticulo;
    @Column(name="dtoFijo")
    private String dtoFijo;
    @Column(name="dtoPP")
    private String dtoPP;
    @Column(name="riesgo")
    private String riesgo;
    @Column(name="tipoFactura")
    private String tipoFactura;
    @Column(name="formaPago")
    private String formaPago;
    @Column(name="diasPago")
    private String diasPago;
    @Column(name="mesNoPago")
    private String mesNoPago;
    @Column(name="leyMorosidad")
    private String leyMorosidad;
    @Column(name="diasPlazoMax")
    private String diasPlazoMax;
    @Column(name="condicionesPago")
    private String condicionesPago;
    @Column(name="recargoFinanciero")
    private String recargoFinanciero;
    @Column(name="seAplicaSobre")
    private String seAplicaSobre;
    
    
    public int getId() {
        return id;
    }

    public String getTipoPVP() {
        return tipoPVP;
    }

    public String getDtoArticulo() {
        return dtoArticulo;
    }

    public String getDtoFijo() {
        return dtoFijo;
    }

    public String getDtoPP() {
        return dtoPP;
    }

    public String getRiesgo() {
        return riesgo;
    }

    public String getTipoFactura() {
        return tipoFactura;
    }

    public String getFormaPago() {
        return formaPago;
    }

    public String getDiasPago() {
        return diasPago;
    }

    public String getMesNoPago() {
        return mesNoPago;
    }

    public String getLeyMorosidad() {
        return leyMorosidad;
    }

    public String getDiasPlazoMax() {
        return diasPlazoMax;
    }

    public String getCondicionesPago() {
        return condicionesPago;
    }

    public String getRecargoFinanciero() {
        return recargoFinanciero;
    }

    public String getSeAplicaSobre() {
        return seAplicaSobre;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTipoPVP(String tipoPVP) {
        this.tipoPVP = tipoPVP;
    }

    public void setDtoArticulo(String dtoArticulo) {
        this.dtoArticulo = dtoArticulo;
    }

    public void setDtoFijo(String dtoFijo) {
        this.dtoFijo = dtoFijo;
    }

    public void setDtoPP(String dtoPP) {
        this.dtoPP = dtoPP;
    }

    public void setRiesgo(String riesgo) {
        this.riesgo = riesgo;
    }

    public void setTipoFactura(String tipoFactura) {
        this.tipoFactura = tipoFactura;
    }

    public void setFormaPago(String formaPago) {
        this.formaPago = formaPago;
    }

    public void setDiasPago(String diasPago) {
        this.diasPago = diasPago;
    }

    public void setMesNoPago(String mesNoPago) {
        this.mesNoPago = mesNoPago;
    }

    public void setLeyMorosidad(String leyMorosidad) {
        this.leyMorosidad = leyMorosidad;
    }

    public void setDiasPlazoMax(String diasPlazoMax) {
        this.diasPlazoMax = diasPlazoMax;
    }

    public void setCondicionesPago(String condicionesPago) {
        this.condicionesPago = condicionesPago;
    }

    public void setRecargoFinanciero(String recargoFinanciero) {
        this.recargoFinanciero = recargoFinanciero;
    }

    public void setSeAplicaSobre(String seAplicaSobre) {
        this.seAplicaSobre = seAplicaSobre;
    }
    
    
    
    
}
