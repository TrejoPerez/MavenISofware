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
public class Intervensiones implements Serializable{
    private Integer IdIntervension;
    private Integer IdPaciente;
    private String fecha;
    private String sintoma;
    private String tratamineto;

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getSintoma() {
        return sintoma;
    }

    public void setSintoma(String sintoma) {
        this.sintoma = sintoma;
    }

    public String getTratamineto() {
        return tratamineto;
    }

    public void setTratamineto(String tratamineto) {
        this.tratamineto = tratamineto;
    }

    public Integer getIdIntervension() {
        return IdIntervension;
    }

    public void setIdIntervension(Integer IdIntervension) {
        this.IdIntervension = IdIntervension;
    }

    public Integer getIdPaciente() {
        return IdPaciente;
    }

    public void setIdPaciente(Integer IdPaciente) {
        this.IdPaciente = IdPaciente;
    }
   
}
