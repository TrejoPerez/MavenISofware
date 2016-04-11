/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControladorClinica;

import ModeloClinica.Administrador;
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
public class PersistenciaAdministrador {
     public static Integer generarId() throws IOException, FileNotFoundException, ClassNotFoundException{
       Integer id=0;
        ArrayList<Administrador> administrador = new ArrayList<>();
        File f = new File("Administradores");
        if(f.exists())administrador = leerAdministrador();
        if(administrador.size()!=0) id =administrador.get(administrador.size()-1).getIdAdministrador()+1;
        return id;
    }
    public static void guardarAdministrador(Administrador d) throws IOException, FileNotFoundException, ClassNotFoundException{
        Integer id=generarId();
        ArrayList<Administrador> administrador = new ArrayList<>();
        File f = new File("Administradores");
        if(f.exists())administrador = leerAdministrador();
        FileOutputStream fos = new FileOutputStream(f);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        d.setIdAdministrador(id);
        administrador.add(d);
        oos.writeObject(administrador);
        System.out.println("Administrador Guardado");
    }
    public static ArrayList<Administrador> leerAdministrador() throws FileNotFoundException, IOException, ClassNotFoundException{
        ArrayList<Administrador> administrador = new ArrayList<>();
        File f = new File("Administradores");
        FileInputStream fis = new FileInputStream(f);
        ObjectInputStream ois = new ObjectInputStream(fis);
        administrador = (ArrayList<Administrador>) ois.readObject();
        return administrador;
    }
}
