package org.example;

import org.example.XML.ControllerXMLMarcial;
import org.example.ficheros.ControlFichero;
import org.example.ficheros.ControlFicheros;

public class Main {
    public static void main(String[] args) {
    ControlFicheros controlFicheros = new ControlFicheros();
    controlFicheros.crearArchivo();
    ControlFichero fichero = new ControlFichero();
    fichero.leerEstudiantes();

    /*ControllerXMLMarcial marcial = new ControllerXMLMarcial();
    marcial.MainXML();*/


    }
}