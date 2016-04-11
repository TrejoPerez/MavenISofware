/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloClinica;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author root
 */
public class Doctor implements Serializable{
    private Integer idDoctor;
    private Integer numeroEmpleado;
    private String nombre;
    private String password;
    private AreasDoctor areasDoctor;
    private ImagenPerfilDoctor imagenPerfilDoctor;
    
    
    
    public Integer getIdDoctor() {
        return idDoctor;
    }

    public void setIdDoctor(Integer idDoctor) {
        this.idDoctor = idDoctor;
    }

    public Integer getNumeroEmpleado() {
        return numeroEmpleado;
    }

    public void setNumeroEmpleado(Integer numeroEmpleado) {
        this.numeroEmpleado = numeroEmpleado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public AreasDoctor getAreasDoctor() {
        return areasDoctor;
    }

    public void setAreasDoctor(AreasDoctor areasDoctor) {
        this.areasDoctor = areasDoctor;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public ImagenPerfilDoctor getImagenPerfilDoctor() {
        return imagenPerfilDoctor;
    }

    public void setImagenPerfilDoctor(ImagenPerfilDoctor imagenPerfilDoctor) {
        this.imagenPerfilDoctor = imagenPerfilDoctor;
    }
    
    
  
}
