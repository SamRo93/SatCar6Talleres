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
@Table(name="clientecontayfide")
public class ClienteContaYFide {
    
    @Id
    @Column(name="id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    
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

    public int getId() {
        return id;
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

    public void setId(int id) {
        this.id = id;
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
    
    
    
}
