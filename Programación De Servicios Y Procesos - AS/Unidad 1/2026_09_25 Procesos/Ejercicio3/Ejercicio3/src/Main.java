import java.io.File;
import java.io.IOException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        ProcessBuilder pb = new ProcessBuilder("notepad");

        try {
            Process p = pb.start();

            while(p.isAlive()){
                System.out.println("El proceso esta vivo...");
                Thread.sleep(3000);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}