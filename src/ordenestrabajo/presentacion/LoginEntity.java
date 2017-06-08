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
@Table(name="login")
public class LoginEntity {
    
    @Id
    @Column(name="id")
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;
    
    @Column(name="usuario")
    private String usuario;
    @Column(name="pass")
    private String pass;

    public int getId() {
        return id;
    }
    
    public String getUsuario() {
        return usuario;
    }

    public String getPass() {
        return pass;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
    
    
}
