package StreamDatos;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.SortedMap;

public class CrearArchivo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el nombre del archivo que quiera crear (debe terminar en .txt): ");
        String archivoNombre = sc.nextLine();

        System.out.println("Ingrese el contenido que desea añadir en el archivo: ");
        String archivocontenido = sc.nextLine();

        System.out.println("Ingrese la ruta donde desea guardar el archivo: ");
        String ruta = sc.nextLine();

        try {

            FileWriter archivo = new FileWriter(ruta + archivoNombre);

            archivo.write(archivocontenido.toString());
            archivo.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
