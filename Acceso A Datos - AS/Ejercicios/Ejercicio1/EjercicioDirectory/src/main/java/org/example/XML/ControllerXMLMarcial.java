package org.example.XML;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public class ControllerXMLMarcial {

    private static final String rutaXML = "src/main/resources/Datos/Entrada";

    private static void convertirXML(Path ficheroTXT, Path ficheroXML) throws IOException {
        StringBuilder builder = new StringBuilder();

        builder.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n");
        builder.append("<alumnos>\n");

        try(BufferedReader reader =
                    Files.newBufferedReader(ficheroTXT, StandardCharsets.UTF_8)){
            String linea;
            while ((linea = reader.readLine())!= null){
                if (linea.trim().isEmpty()){
                    continue;
                }
                String[] datos = linea.split(";");
                if (datos.length < 2){
                    continue;
                }
                String nombre = datos[0].trim();
                String edad = datos[1].trim();

                builder.append("<alumno>\n");

                builder.append("    <nombre>");
                builder.append(nombre);
                builder.append("</nombre>\n");

                builder.append("    <edad>");
                builder.append(edad);
                builder.append("</edad>\n");

                builder.append("</alumno>\n");
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
        Files.writeString(
                ficheroXML,
                builder.toString(),
                StandardCharsets.UTF_8
        );
    }
    public void MainXML(){
        Path ficheroTXT = Path.of(rutaXML + "/alumnos.txt");
        Path ficheroXML = Path.of(rutaXML + "/alumnosMarcial.xml");

        try{
            convertirXML(ficheroTXT, ficheroXML);
            System.out.println("XML creado correctamente");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
