/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControladorClinica;

import ModeloClinica.Paciente;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author root
 */
public class PersistenciaPaciente {
    public static Integer getIdPaciente() throws IOException, FileNotFoundException, ClassNotFoundException{
        Integer id=0;
        ArrayList<Paciente> paciente = new ArrayList<>();
        File f = new File("Pacientesp");
        if(f.exists())paciente = leerPaciente();
        if(paciente.size()!=0)id = paciente.get(paciente.size()-1).getIdPaciente()+1;
        return id;
    }
    public static void guardarPaciente(Paciente p) throws IOException, FileNotFoundException, ClassNotFoundException{
        Integer id=getIdPaciente();
        ArrayList<Paciente> paciente = new ArrayList<>();
        File f = new File("Pacientesp");
        if(f.exists())paciente = leerPaciente();
        FileOutputStream fos = new FileOutputStream(f);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        p.setIdPaciente(id);
        paciente.add(p);
        oos.writeObject(paciente);
        System.out.println("Paciente Registrado");
    }
    public static ArrayList<Paciente> leerPaciente() throws FileNotFoundException, IOException, ClassNotFoundException{
        ArrayList<Paciente> paciente = new ArrayList<>();
        File f = new File("Pacientesp");
        FileInputStream fis = new FileInputStream(f);
        ObjectInputStream ois = new ObjectInputStream(fis);
        paciente = (ArrayList<Paciente>) ois.readObject();
        return paciente;
        
    }
}
