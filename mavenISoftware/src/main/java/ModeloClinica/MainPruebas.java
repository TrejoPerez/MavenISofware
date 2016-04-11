/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloClinica;

import ControladorClinica.PersistenciaDoctor;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author root
 */
public class MainPruebas {
    public static void main(String[] args) throws IOException, FileNotFoundException, ClassNotFoundException {
        ArrayList<Doctor> d = PersistenciaDoctor.leerDoctor();
        /*Doctor doctor = new Doctor();
        doctor.setIdDoctor(0);*/
        AreasDoctor areasDoctor = new AreasDoctor();
        areasDoctor.setAreaPiso(4);
        for(Doctor p :PersistenciaDoctor.leerDoctor()){    
            if(areasDoctor.getAreaPiso().equals(p.getAreasDoctor().getAreaPiso())){
                System.out.println("El area es  "+ p.getAreasDoctor().getEspecialidadDoctor()+" fue atendido por el doctor " +d.get(p.getIdDoctor()).getNombre() + " en el piso " + d.get(p.getIdDoctor()).getAreasDoctor().getAreaPiso());            }
        }
    }
}
