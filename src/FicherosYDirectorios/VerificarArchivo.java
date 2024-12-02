package FicherosYDirectorios;

import java.io.File;

public class VerificarArchivo {
    public static void main(String[] args){

        // Crear un objeto File asociado al archivo "Holajeje.txt"
        File archivo = new File("Holajeje.txt");

        // Obtener y mostrar la ruta absoluta del archivo
        System.out.println("Ruta: " + archivo.getAbsoluteFile());
        // Este método devuelve un objeto File con la ruta absoluta del archivo o directorio.
        // Se usa getAbsoluteFile() para convertir la ruta relativa a absoluta.

        // Verificar si el archivo existe en el sistema
        System.out.println("Existe: " + archivo.exists());
        // El método exists() devuelve true si el archivo o directorio existe en el sistema.
        // Si no existe, devuelve false.

    }
}
