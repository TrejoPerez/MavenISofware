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
public class Paciente implements Serializable{
    private Integer idPaciente;
    private Integer idDcotor;
    private Integer IdIntervension;
    private Integer nSeguroSocial;
    private String nombre;
    private Integer edad;
    private String fechaIngreso;
    private Intervensiones intervensiones;

    public Integer getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(Integer idPaciente) {
        this.idPaciente = idPaciente;
    }

    public Integer getnSeguroSocial() {
        return nSeguroSocial;
    }

    public void setnSeguroSocial(Integer nSeguroSocial) {
        this.nSeguroSocial = nSeguroSocial;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public Intervensiones getIntervensiones() {
        return intervensiones;
    }

    public void setIntervensiones(Intervensiones intervensiones) {
        this.intervensiones = intervensiones;
    }

    public Integer getIdDcotor() {
        return idDcotor;
    }

    public void setIdDcotor(Integer idDcotor) {
        this.idDcotor = idDcotor;
    }

    public Integer getIdIntervension() {
        return IdIntervension;
    }

    public void setIdIntervension(Integer IdIntervension) {
        this.IdIntervension = IdIntervension;
    }
}
