package org.example.ficheros;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ControlFicheros {

    private final String rutaDirectorio = "src/main/resources/Datos/Entrada";
    private final String rutaFichero = rutaDirectorio + "/alumnos.txt";

    private void crearDirectorio(){
        Path path = Path.of(rutaDirectorio);
        try{
            Files.createDirectories(path);
            System.out.println("Directorio creado correctamente");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public void crearArchivo(){
        Path pathAlumno = Path.of(rutaFichero);

        try{
            if (!Files.exists(Path.of(rutaDirectorio))){
                crearDirectorio();
            }
            if (!Files.exists(pathAlumno)){
                Files.createFile(Path.of(rutaFichero));
                System.out.println("Archivo .txt creado correctamente");
                return;
            }
            System.out.println("El archivo .txt ya existia");

        }catch (IOException e){
            System.out.println(e.getMessage());
        }


    }
}