package org.example;

import java.sql.*;

public class Main {
    private static final String URLPrueba = "jdbc:sqlite:clase.db";

    public static void main(String[] args) {
        try(Connection conexPrueba =DriverManager.getConnection(URLPrueba)){
            System.out.println("Conexión correcta");
            String sqlCrearTabla = """
                    CREATE TABLE IF NOT EXISTS alumno(
                        id INTEGER PRIMARY KEY,
                        nombre TEXT,
                        asignatura TEXT,
                        nota REAL)
                """;
            try(Statement st = conexPrueba.createStatement()){
                st.executeUpdate(sqlCrearTabla);
            }
            String sqlAlumnos = """
                        INSERT INTO alumno (id, nombre, asignatura, nota )
                        VALUES(?,?,?,?)
                    """;
           /* try(PreparedStatement ps = conexPrueba.prepareStatement(sqlAlumnos)){
                ps.setInt(1,1);
                ps.setString(2,"Antonio");
                ps.setString(3, "Acceso a Datos");
                ps.setDouble(4, 9.75);

                ps.setInt(1,2);
                ps.setString(2,"Paco");
                ps.setString(3, "Acceso a Datos");
                ps.setDouble(4, 9.8);
                ps.execute();
            }*/

            String sqlBusqueda = """
                        SELECT id, nombre, asignatura, nota
                        FROM alumno
                        ORDER BY id
                    """;
            try(PreparedStatement ps2 = conexPrueba.prepareStatement(sqlBusqueda)){
                ResultSet result = ps2.executeQuery();
                    while(result.next()){
                        String nombre = result.getString("nombre");
                        double nota = result.getDouble("nota");
                        System.out.println("nombre: "+nombre+"\nnota: "+nota+"\n");
                    }
            }
        }catch (SQLException e ){
            System.out.println(e.getMessage());
        }
    }
}