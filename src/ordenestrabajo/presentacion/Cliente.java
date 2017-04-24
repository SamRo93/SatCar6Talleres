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

public class Cliente implements Serializable{

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

    public void setCuentaCliente(String cuentaCliente) {
        this.cuentaCliente = cuentaCliente;
    }

    public void setCuentaVentas(String cuentaVentas) {
        this.cuentaVentas = cuentaVentas;
    }

    public void setCuentaRecargoFinanciero(String cuentaRecargoFinanciero) {
        this.cuentaRecargoFinanciero = cuentaRecargoFinanciero;
    }

    public void setCuentaDto(String cuentaDto) {
        this.cuentaDto = cuentaDto;
    }

    public void setCuentaDtoPP(String cuentaDtoPP) {
        this.cuentaDtoPP = cuentaDtoPP;
    }

    public void setCuentaPortes(String cuentaPortes) {
        this.cuentaPortes = cuentaPortes;
    }

    public void setNTarjeta(String NTarjeta) {
        this.NTarjeta = NTarjeta;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setPuntos(String puntos) {
        this.puntos = puntos;
    }

    public void setFechaVtoPuntos(String fechaVtoPuntos) {
        this.fechaVtoPuntos = fechaVtoPuntos;
    }

    public void setEurosReales(String eurosReales) {
        this.eurosReales = eurosReales;
    }

    public void setFechaVtoEuros(String fechaVtoEuros) {
        this.fechaVtoEuros = fechaVtoEuros;
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

    public String getCuentaCliente() {
        return cuentaCliente;
    }

    public String getCuentaVentas() {
        return cuentaVentas;
    }

    public String getCuentaRecargoFinanciero() {
        return cuentaRecargoFinanciero;
    }

    public String getCuentaDto() {
        return cuentaDto;
    }

    public String getCuentaDtoPP() {
        return cuentaDtoPP;
    }

    public String getCuentaPortes() {
        return cuentaPortes;
    }

    public String getNTarjeta() {
        return NTarjeta;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getPuntos() {
        return puntos;
    }

    public String getFechaVtoPuntos() {
        return fechaVtoPuntos;
    }

    public String getEurosReales() {
        return eurosReales;
    }

    public String getFechaVtoEuros() {
        return fechaVtoEuros;
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
    @Id
    @Column(name="id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    
   @Column(name="razonSocial")
   private String razonSocial;
   @Column(name="nombreComercial")
   private String nombreComercial;
   @Column(name="NIF")
   private String NIF;
   @Column(name="domicilio")
   private String domicilio;
   @Column(name="poblacion")
   private String poblacion;
   @Column(name="CP")
   private String CP;
   @Column(name="provincia")
   private String provincia;
   @Column(name="pais")
   private String pais;
   @Column(name="tlf1")
   private String tlf1;
   @Column(name="email")
   private String email;
   @Column(name="paginaWeb")
   private String paginaWeb;
   @Column(name="fechaAlta")
   private String fechaAlta;
   @Column(name="observaciones")
   private String observaciones;
    @Column(name="banco")
    private String banco;
    @Column(name="codigPais")
    private String codigoPais;
    @Column(name="titular")
    private String titular;
    @Column(name="codCuentaBancaria")
    private String codCuentaBancaria;
    @Column(name="codDevolucion")
    private String codDevolucion;
    @Column(name="codIntCuentaBancaria")
    private String codIntCuentaBancaria;
    @Column(name="IBAN")
    private String IBAN;
    @Column(name="adeudoSepa")
    private String adeudoSepa;
    @Column(name="tipoSecuencia")
    private String tipoSecuencia;
    @Column(name="referenciaMandato")
    private String referenciaMandato;
    @Column(name="fechaMandato")
    private String fechaMandato;
    @Column(name="bancoAcreedor")
    private String bancoAcreedor;
    @Column(name="cuentaCliente")
    private String cuentaCliente;
    @Column(name="cuentaVentas")
    private String cuentaVentas;
    @Column(name="cuentaRecargoFinanciero")
    private String cuentaRecargoFinanciero;
    @Column(name="cuentaDto")
    private String cuentaDto;
    @Column(name="cuentaDtoPP")
    private String cuentaDtoPP;
    @Column(name="cuentaPortes")
    private String cuentaPortes;
    @Column(name="NTarjeta")
    private String NTarjeta;
    @Column(name="fechaNacimiento")
    private String fechaNacimiento;
    @Column(name="puntos")
    private String puntos;
    @Column(name="fechaVtoPuntos")
    private String fechaVtoPuntos;
    @Column(name="eurosReales")
    private String eurosReales;
    @Column(name="fechaVtoEuros")
    private String fechaVtoEuros;
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

    public String getBanco() {
        return banco;
    }

    public String getCodigoPais() {
        return codigoPais;
    }

    public String getTitular() {
        return titular;
    }

    public String getCodCuentaBancaria() {
        return codCuentaBancaria;
    }

    public String getCodDevolucion() {
        return codDevolucion;
    }

    public String getCodIntCuentaBancaria() {
        return codIntCuentaBancaria;
    }

    public String getIBAN() {
        return IBAN;
    }

    public String getAdeudoSepa() {
        return adeudoSepa;
    }

    public String getTipoSecuencia() {
        return tipoSecuencia;
    }

    public String getReferenciaMandato() {
        return referenciaMandato;
    }

    public String getFechaMandato() {
        return fechaMandato;
    }

    public String getBancoAcreedor() {
        return bancoAcreedor;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public void setCodigoPais(String codigoPais) {
        this.codigoPais = codigoPais;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setCodCuentaBancaria(String codCuentaBancaria) {
        this.codCuentaBancaria = codCuentaBancaria;
    }

    public void setCodDevolucion(String codDevolucion) {
        this.codDevolucion = codDevolucion;
    }

    public void setCodIntCuentaBancaria(String codIntCuentaBancaria) {
        this.codIntCuentaBancaria = codIntCuentaBancaria;
    }

    public void setIBAN(String IBAN) {
        this.IBAN = IBAN;
    }

    public void setAdeudoSepa(String adeudoSepa) {
        this.adeudoSepa = adeudoSepa;
    }

    public void setTipoSecuencia(String tipoSecuencia) {
        this.tipoSecuencia = tipoSecuencia;
    }

    public void setReferenciaMandato(String referenciaMandato) {
        this.referenciaMandato = referenciaMandato;
    }

    public void setFechaMandato(String fechaMandato) {
        this.fechaMandato = fechaMandato;
    }

    public void setBancoAcreedor(String bancoAcreedor) {
        this.bancoAcreedor = bancoAcreedor;
    }    
}
