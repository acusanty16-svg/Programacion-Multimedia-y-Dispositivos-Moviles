import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

void main(){
    /*Path carpeta_origen = Path.of("Datos","entrada");
    System.out.println(carpeta_origen);

    try {
        Files.createDirectories(carpeta_origen);
    } catch (IOException e) {
        System.out.println("Error: "+ e.getMessage());
    }*/

    Path carpeta_origen = Path.of("src","Datos");
    System.out.println(carpeta_origen);

    try{
        Files.createDirectories(carpeta_origen);
        Path fichero_destino = carpeta_origen.resolve("fichero.txt");
        System.out.println(fichero_destino);
        if(!Files.exists(fichero_destino)){
            Files.createFile(fichero_destino);
        }
        System.out.println("Fichero ya existe");
    } catch (IOException e) {
        throw new RuntimeException(e);
    }
}