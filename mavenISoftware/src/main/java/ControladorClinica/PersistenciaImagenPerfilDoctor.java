/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControladorClinica;

import ModeloClinica.ImagenPerfilDoctor;
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
public class PersistenciaImagenPerfilDoctor {
    public static Integer generarId() throws IOException, FileNotFoundException, ClassNotFoundException{
       Integer id=0;
        ArrayList<ImagenPerfilDoctor> imagenPerfilDoctor = new ArrayList<>();
        File f = new File("ImagenPerfilDoctores");
        if(f.exists())imagenPerfilDoctor = leerImagenPerfilDoctor();
        if(imagenPerfilDoctor.size()!=0) id =imagenPerfilDoctor.get(imagenPerfilDoctor.size()-1).getIdImagenPerfilDoctor()+1;
        return id;
    }
    public static void guardarImagenPerfilDoctor(ImagenPerfilDoctor d) throws IOException, FileNotFoundException, ClassNotFoundException{
        Integer id=generarId();
        ArrayList<ImagenPerfilDoctor> imagenPerfilDoctor = new ArrayList<>();
        File f = new File("ImagenPerfilDoctores");
        if(f.exists())imagenPerfilDoctor = leerImagenPerfilDoctor();
        FileOutputStream fos = new FileOutputStream(f);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        d.setIdImagenPerfilDoctor(id);
        imagenPerfilDoctor.add(d);
        oos.writeObject(imagenPerfilDoctor);
        System.out.println("ImagenPerfilDoctor Guardado");
    }
    public static ArrayList<ImagenPerfilDoctor> leerImagenPerfilDoctor() throws FileNotFoundException, IOException, ClassNotFoundException{
        ArrayList<ImagenPerfilDoctor> imagenPerfilDoctor = new ArrayList<>();
        File f = new File("ImagenPerfilDoctores");
        FileInputStream fis = new FileInputStream(f);
        ObjectInputStream ois = new ObjectInputStream(fis);
        imagenPerfilDoctor = (ArrayList<ImagenPerfilDoctor>) ois.readObject();
        return imagenPerfilDoctor;
    }
}
