/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControladorClinica;

import ModeloClinica.AreasDoctor;
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
public class PersistenciaAreasDoctor {
     public static Integer generarId() throws IOException, FileNotFoundException, ClassNotFoundException{
       Integer id=0;
        ArrayList<AreasDoctor> areasDoctor = new ArrayList<>();
        File f = new File("AreasDoctores");
        if(f.exists())areasDoctor = leerAreasDoctor();
        if(areasDoctor.size()!=0) id =areasDoctor.get(areasDoctor.size()-1).getIdArea()+1;
        return id;
    }
    public static void guardarAreasDoctor(AreasDoctor d) throws IOException, FileNotFoundException, ClassNotFoundException{
        Integer id=generarId();
        ArrayList<AreasDoctor> areasDoctor = new ArrayList<>();
        File f = new File("AreasDoctores");
        if(f.exists())areasDoctor = leerAreasDoctor();
        FileOutputStream fos = new FileOutputStream(f);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        d.setIdArea(id);
        areasDoctor.add(d);
        oos.writeObject(areasDoctor);
        System.out.println("Area Guardada");
    }
    public static ArrayList<AreasDoctor> leerAreasDoctor() throws FileNotFoundException, IOException, ClassNotFoundException{
        ArrayList<AreasDoctor> areasDoctor = new ArrayList<>();
        File f = new File("AreasDoctores");
        FileInputStream fis = new FileInputStream(f);
        ObjectInputStream ois = new ObjectInputStream(fis);
        areasDoctor = (ArrayList<AreasDoctor>) ois.readObject();
        return areasDoctor;
    }
}
