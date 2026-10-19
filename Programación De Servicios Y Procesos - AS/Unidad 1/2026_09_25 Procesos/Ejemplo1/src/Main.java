import java.io.IOException;
import java.util.Map;
import java.util.concurrent.TimeUnit;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        try{
            ProcessBuilder proceso = new ProcessBuilder("notepad.exe","datos.txt");
            Map<String, String> env = proceso.environment();
            for(Map.Entry<String, String> entrada : env.entrySet()){
                System.out.println("Clave: "+entrada.getKey() + " - Valor: "+entrada.getValue());
            }

            Process p = proceso.start();
            System.out.println("Se ha lanzado el proceso");

            long pid = p.pid();
            System.out.println("PID del proceso: "+pid);

            if (p.isAlive()){
                System.out.println("Esta vivo...");
            }else {
                int salida = p.exitValue();
                System.out.println("El proceso ha finalizado");
            }

            p.waitFor(5, TimeUnit.SECONDS);

            int salida = p.exitValue();
            System.out.println("El proceso ha finalizado");
            System.out.println(salida);
            System.out.println("FIN DEL MAIN");
        }catch (IOException | InterruptedException e){
            System.out.println("[ERROR] En la ejecucion del proceso");
            System.out.println(e.getMessage());
        }
    }
}