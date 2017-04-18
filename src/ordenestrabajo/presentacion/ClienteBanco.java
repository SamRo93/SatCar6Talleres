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
@Table(name="clientebanco")

public class ClienteBanco implements Serializable{
    @Id
    @Column(name="id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    
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
