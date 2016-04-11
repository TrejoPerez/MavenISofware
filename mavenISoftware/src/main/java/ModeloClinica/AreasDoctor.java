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
public class AreasDoctor implements Serializable{
    private Integer idarea;
    private Integer idDoctor;
    private Integer areaPiso;
    private String turno;
    private String especialidadDoctor;
    

    public Integer getIdArea() {
        return idarea;
    }

    public void setIdArea(Integer area) {
        this.idarea = area;
    }

    public Integer getIdDoctor() {
        return idDoctor;
    }

    public void setIdDoctor(Integer idDoctor) {
        this.idDoctor = idDoctor;
    }

    public String getEspecialidadDoctor() {
        return especialidadDoctor;
    }

    public void setEspecialidadDoctor(String especialidadDoctor) {
        this.especialidadDoctor = especialidadDoctor;
    }

    public Integer getAreaPiso() {
        return areaPiso;
    }

    public void setAreaPiso(Integer areaPiso) {
        this.areaPiso = areaPiso;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    
    
    
}
