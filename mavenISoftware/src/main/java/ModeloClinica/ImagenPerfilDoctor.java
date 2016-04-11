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
public class ImagenPerfilDoctor implements Serializable{
    private Integer idImagenPerfilDoctor;
    private Integer idDoctor;
    private byte [] imagen;

    public byte[] getImagen() {
        return imagen;
    }

    public void setImagen(byte[] imagen) {
        this.imagen = imagen;
    }

    public Integer getIdImagenPerfilDoctor() {
        return idImagenPerfilDoctor;
    }

    public void setIdImagenPerfilDoctor(Integer idImagenPerfilDoctor) {
        this.idImagenPerfilDoctor = idImagenPerfilDoctor;
    }

    public Integer getIdDoctor() {
        return idDoctor;
    }

    public void setIdDoctor(Integer idDoctor) {
        this.idDoctor = idDoctor;
    }
    
}
