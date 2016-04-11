/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloClinica;

import java.io.Serializable;

/**
 *
 * @author root
 */
public class Administrador implements Serializable{
    private Integer idAdministrador;
    private String nombreAdministrador;
    private String passwordAdministrador;

    public Integer getIdAdministrador() {
        return idAdministrador;
    }

    public void setIdAdministrador(Integer idAdministrador) {
        this.idAdministrador = idAdministrador;
    }

    public String getNombreAdministrador() {
        return nombreAdministrador;
    }

    public void setNombreAdministrador(String nombreAdministrador) {
        this.nombreAdministrador = nombreAdministrador;
    }

    public String getPasswordAdministrador() {
        return passwordAdministrador;
    }

    public void setPasswordAdministrador(String passwordAdministrador) {
        this.passwordAdministrador = passwordAdministrador;
    }
}
