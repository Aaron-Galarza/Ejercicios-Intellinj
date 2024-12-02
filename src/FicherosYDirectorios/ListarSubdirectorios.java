package FicherosYDirectorios;

import java.io.File;
import java.util.Scanner;

public class ListarSubdirectorios {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.println("Escriba la ruta del directorio que desea analizar: ");
            // Cambia este path al que desees analizar
            String ruta = sc.nextLine();

            // Crear un objeto File que representa la carpeta indicada
            File carpeta = new File(ruta);

            // Obtener la lista de nombres de los archivos y subcarpetas dentro de la carpeta
            String[] nombres = carpeta.list();

            // Comprobar que la carpeta no sea nula (podría ser nula si no existe o no es accesible)
            if (nombres == null) {

                System.out.println("La carpeta no existe o no es un directorio válido.");
                return; // Salir del programa si la carpeta no es válida

            }

            // Iterar sobre los nombres de los archivos y subcarpetas
            for (int i = 0; i < nombres.length; i++) {

                // Mostrar el nombre del archivo o subcarpeta
                System.out.println(i + ": " + nombres[i]);

                // Crear un objeto File para cada archivo/subcarpeta con su ruta absoluta
                File f = new File(carpeta.getAbsolutePath(), nombres[i]);

                // Verificar si el archivo es un directorio
                if (f.isDirectory()) {

                    System.out.println("\tEs un directorio:");

                    // Obtener la lista de nombres dentro de este subdirectorio
                    String[] nombresSubCarpetas = f.list();

                    // Comprobar que el subdirectorio no sea nulo
                    if (nombresSubCarpetas != null) {

                        // Iterar sobre los elementos dentro del subdirectorio
                        for (int j = 0; j < nombresSubCarpetas.length; j++) {

                            // Mostrar los nombres de los archivos o subcarpetas en el subdirectorio
                            System.out.println("\t\t" + j + ": " + nombresSubCarpetas[j]);

                        }

                    }

                }

            }

        }
}

