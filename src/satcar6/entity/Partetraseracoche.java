package satcar6.entity;
// Generated 11-jul-2017 20:30:24 by Hibernate Tools 4.3.1



/**
 * Partetraseracoche generated by hbm2java
 */
public class Partetraseracoche  implements java.io.Serializable {


     private Integer id;
     private String obsPartetrasera;
     private String materialestrasera;
     private Integer idCliente;

    public Partetraseracoche() {
    }

    public Partetraseracoche(String obsPartetrasera, String materialestrasera, Integer idCliente) {
       this.obsPartetrasera = obsPartetrasera;
       this.materialestrasera = materialestrasera;
       this.idCliente = idCliente;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public String getObsPartetrasera() {
        return this.obsPartetrasera;
    }
    
    public void setObsPartetrasera(String obsPartetrasera) {
        this.obsPartetrasera = obsPartetrasera;
    }
    public String getMaterialestrasera() {
        return this.materialestrasera;
    }
    
    public void setMaterialestrasera(String materialestrasera) {
        this.materialestrasera = materialestrasera;
    }
    public Integer getIdCliente() {
        return this.idCliente;
    }
    
    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }




}


