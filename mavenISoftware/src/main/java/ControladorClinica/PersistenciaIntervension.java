/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControladorClinica;

import ModeloClinica.Intervensiones;
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
public class PersistenciaIntervension {
     public static Integer generarId() throws IOException, FileNotFoundException, ClassNotFoundException{
       Integer id=0;
        ArrayList<Intervensiones> intervension = new ArrayList<>();
        File f = new File("Intervensiones");
        if(f.exists())intervension = leerIntervensiones();
        if(intervension.size()!=0) id =intervension.get(intervension.size()-1).getIdIntervension()+1;
        return id;
    }
    public static void guardarIntervensiones(Intervensiones d) throws IOException, FileNotFoundException, ClassNotFoundException{
        Integer id=generarId();
        ArrayList<Intervensiones> intervension = new ArrayList<>();
        File f = new File("Intervensiones");
        if(f.exists())intervension = leerIntervensiones();
        FileOutputStream fos = new FileOutputStream(f);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        d.setIdIntervension(id);
        intervension.add(d);
        oos.writeObject(intervension);
        System.out.println("Intervensiones Guardado");
    }
    public static ArrayList<Intervensiones> leerIntervensiones() throws FileNotFoundException, IOException, ClassNotFoundException{
        ArrayList<Intervensiones> intervension = new ArrayList<>();
        File f = new File("Intervensiones");
        FileInputStream fis = new FileInputStream(f);
        ObjectInputStream ois = new ObjectInputStream(fis);
        intervension = (ArrayList<Intervensiones>) ois.readObject();
        return intervension;
    }
}
