/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenestrabajo.presentacion;

import ordenestrabajo.dao_persistencia.*;

/**
 *
 * @author Samuel
 */
public class ReparacionController {
      /**
     * Creates new form JFrameCalculadora
     */
    private int numeroReparacion;
    private String matricula;
    private String marca;
    private String modelo;
    private int anio;
    private String color;
    private int numMotor;
    private int KM;
    private int numBastidor;
    private int combustible;
    private String fechaHora;
    private int cliente;
    private String obsInterna;
    
    public void setNumeroReparacion(int numeroReparacion) {
        this.numeroReparacion = numeroReparacion;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setNumMotor(int numMotor) {
        this.numMotor = numMotor;
    }

    public void setKM(int KM) {
        this.KM = KM;
    }

    public void setNumBastidor(int numBastidor) {
        this.numBastidor = numBastidor;
    }

    public void setCombustible(int combustible) {
        this.combustible = combustible;
    }

    public void setFechaHora(String fechaHora) {
        this.fechaHora = fechaHora;
    }

    public void setCliente(int cliente) {
        this.cliente = cliente;
    }

    public void setObsInterna(String obsInterna) {
        this.obsInterna = obsInterna;
    }

    public int getNumeroReparacion() {
        return numeroReparacion;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAnio() {
        return anio;
    }

    public String getColor() {
        return color;
    }

    public int getNumMotor() {
        return numMotor;
    }



    public int getKM() {
        return KM;
    }

    public int getNumBastidor() {
        return numBastidor;
    }

    public int getCombustible() {
        return combustible;
    }

    public String getFechaHora() {
        return fechaHora;
    }

    public int getCliente() {
        return cliente;
    }

    public String getObsInterna() {
        return obsInterna;
    }
    
}
