/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControladorClinica;

import ModeloClinica.Doctor;
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
public class PersistenciaDoctor {
    public static Integer generarId() throws IOException, FileNotFoundException, ClassNotFoundException{
       Integer id=0;
        ArrayList<Doctor> doctor = new ArrayList<>();
        File f = new File("Doctores");
        if(f.exists())doctor = leerDoctor();
        if(doctor.size()!=0) id =doctor.get(doctor.size()-1).getIdDoctor()+1;
        return id;
    }
    public static void guardarDoctor(Doctor d) throws IOException, FileNotFoundException, ClassNotFoundException{
        Integer id=generarId();
        ArrayList<Doctor> doctor = new ArrayList<>();
        File f = new File("Doctores");
        if(f.exists())doctor = leerDoctor();
        FileOutputStream fos = new FileOutputStream(f);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        d.setIdDoctor(id);
        doctor.add(d);
        oos.writeObject(doctor);
        System.out.println("Doctor Guardado");
    }
    public static ArrayList<Doctor> leerDoctor() throws FileNotFoundException, IOException, ClassNotFoundException{
        ArrayList<Doctor> doctor = new ArrayList<>();
        File f = new File("Doctores");
        FileInputStream fis = new FileInputStream(f);
        ObjectInputStream ois = new ObjectInputStream(fis);
        doctor = (ArrayList<Doctor>) ois.readObject();
        return doctor;
    }
}
