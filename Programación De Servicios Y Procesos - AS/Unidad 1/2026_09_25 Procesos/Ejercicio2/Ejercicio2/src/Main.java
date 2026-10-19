import java.io.File;
import java.io.IOException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        ProcessBuilder pb = new ProcessBuilder("notepad","hola.txt");
        pb.directory(new File(
                "C:\\Users\\acusa\\OneDrive\\Documents\\GitHub\\2do Año DAM" +
                        "\\Programación De Servicios Y Procesos - AS\\Unidad 1\\2026_09_25 Procesos" +
                        "\\Ejercicio2\\Ejercicio2"));

        try {
            Process p = pb.start();
            System.out.println("Ruta Trabajo: "+pb.directory().getAbsolutePath());
            System.out.println("PID: "+p.pid());
            Thread.sleep(2000);

            if(p.isAlive()){
                System.out.println("Terminamos el proceso de forma manual");
                p.destroyForcibly();
            }else {
                System.out.println("El proceso ha finalizado");
            }

        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}