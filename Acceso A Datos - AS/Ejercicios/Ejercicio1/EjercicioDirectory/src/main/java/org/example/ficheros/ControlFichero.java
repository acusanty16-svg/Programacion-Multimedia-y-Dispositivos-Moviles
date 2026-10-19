package org.example.ficheros;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ControlFichero {
    private final String rutaFichero = "src/main/resources/Datos/Entrada/alumnos.txt";

    private void escribirEstudiante(){
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(rutaFichero))){
            String[] nombres = new String[]{"Pepito", "Andrea", "Marta", "Carmenza", "Josefo", "Anastasio"};
            for (int i = 1; i < 21; i++) {
                String nombre = nombres[(int) (Math.random()*6)];
                int edad = (int) (Math.random()*13)+18;
                writer.write(nombre + ";"+ edad);
                writer.newLine();
            }
            System.out.println("Los 20 estudiantes se han registrado correctamente");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public List<String[]> leerEstudiantes(){
        List<String[]> listaAlumnos = new ArrayList<>();
        File archivo = new File(rutaFichero);
        if (!archivo.exists() || archivo.length() == 0){
            escribirEstudiante();
        }else {
            System.out.println("Los estudiantes ya estaban registrados");
        }

        try(BufferedReader reader = new BufferedReader(new FileReader(rutaFichero))){
            ;
            String linea;
            while ((linea = reader.readLine()) != null){
                String[] datos = linea.split(";");
                listaAlumnos.add(datos);
            }
            System.out.println("Se han leido "+listaAlumnos.size() + " estudiantes");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return listaAlumnos;
    }
}
