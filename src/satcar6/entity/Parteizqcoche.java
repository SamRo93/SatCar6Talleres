package satcar6.entity;
// Generated 11-jul-2017 20:30:24 by Hibernate Tools 4.3.1



/**
 * Parteizqcoche generated by hbm2java
 */
public class Parteizqcoche  implements java.io.Serializable {


     private Integer id;
     private String obsParteizq;
     private String materialesizq;
     private Integer idCliente;

    public Parteizqcoche() {
    }

    public Parteizqcoche(String obsParteizq, String materialesizq, Integer idCliente) {
       this.obsParteizq = obsParteizq;
       this.materialesizq = materialesizq;
       this.idCliente = idCliente;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public String getObsParteizq() {
        return this.obsParteizq;
    }
    
    public void setObsParteizq(String obsParteizq) {
        this.obsParteizq = obsParteizq;
    }
    public String getMaterialesizq() {
        return this.materialesizq;
    }
    
    public void setMaterialesizq(String materialesizq) {
        this.materialesizq = materialesizq;
    }
    public Integer getIdCliente() {
        return this.idCliente;
    }
    
    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }




}

