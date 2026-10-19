import java.io.File;
import java.io.IOException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Ejercicio1 {
    public static void main(String[] args) {

        if (args.length == 0){
            System.out.println("[ERROR] Faltan argumentos");
            System.exit(1);
        }
       /* ProcessBuilder pb = new ProcessBuilder(args);
        pb.directory(new File(
                "C:\\Program Files\\WindowsApps\\Microsoft.WindowsNotepad_11.2607.14.0_x64__8wekyb3d8bbwe\\Notepad"));
        System.out.println("Directorio: "+pb.directory());*/

        ProcessBuilder pb = new ProcessBuilder(args);

        try{
            Process p = pb.start();
            System.out.println("PID: "+p.pid());

            int exit = p.waitFor();
            System.out.println("Codigo de Salida: "+exit);
            System.out.println(pb.command());
            System.exit(0);

            /*if (p.isAlive()){
                System.out.println("Terminamos proceso de forma manual");
            }else {
                System.out.println("El proceso ha finalizado");
            }*/

        } catch (IOException | InterruptedException e) {
            System.out.println("[ERROR] "+ e.getMessage());
            throw new RuntimeException(e);
        }
    }
}