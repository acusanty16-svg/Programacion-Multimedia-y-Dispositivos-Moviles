import java.io.*;

public class Main {
    public static void main(String[] args) {
        String ruta = "alumnos.txt";
        try{
            BufferedWriter writer = new BufferedWriter(new FileWriter(ruta));
            writer.write("Nombre: Ana, Ciclo: DAM");
            writer.newLine();
            writer.write("Nombre: Luis, Ciclo: ASIR");
            writer.newLine();
            writer.write("Nombre: Andres, Ciclo: DAM");
            writer.newLine();
            System.out.println("Fichero guardado con exito");
        }catch (IOException e){
            System.out.println(e.getMessage());
        }

        try{
            BufferedReader reader = new BufferedReader(new FileReader(ruta));
            String linea;
            while ((linea = reader.readLine()) != null){
                System.out.println(linea);
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}