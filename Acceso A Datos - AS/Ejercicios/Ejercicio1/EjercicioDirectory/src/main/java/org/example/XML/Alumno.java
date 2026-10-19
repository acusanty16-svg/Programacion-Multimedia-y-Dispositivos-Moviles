package org.example.XML;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public record Alumno(
        @JacksonXmlProperty(localName = "nombre") String nombre,
        @JacksonXmlProperty(localName = "edad") int edad
) {}
