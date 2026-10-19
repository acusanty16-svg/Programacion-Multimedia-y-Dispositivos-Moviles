package org.example.XML;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class ControllerXMLJAXB {

    private final XmlMapper xmlMapper = new XmlMapper();

    public void escribirXML(List<Alumno> alumnos, String ruta) throws IOException {
        ListaAlumnos lista = new ListaAlumnos(alumnos);
        xmlMapper.writeValue(new File(ruta), lista);
    }

    public ListaAlumnos leerXML(String ruta) throws IOException {
        return xmlMapper.readValue(new File(ruta), ListaAlumnos.class);
    }
}