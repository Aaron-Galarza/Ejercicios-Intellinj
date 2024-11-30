package StreamDatos;

import java.io.FileReader;

public class ArchivoTXT {

    public static void main(String[] args) {
        // Crear una instancia de la clase ArchivoTXT para acceder al método LeerArchivos
        ArchivoTXT lector = new ArchivoTXT();
        // Llamar al método LeerArchivos pasando la ruta del archivo como argumento
        lector.LeerArchivos("C:/Users/Usuario/Desktop/Aaron/UTN-TUP/Programacion/StreamEjemplos/Holajeje.txt");
    }

    public void EscribirArchivos(){



    }

    public void LeerArchivos(String ruta) {
        try {
            // Crear un objeto FileReader para leer el archivo de texto en la ruta especificada
            FileReader entrada = new FileReader(ruta);

            // Leer el primer carácter del archivo
            int caracter = entrada.read();
            System.out.println(caracter);
            // Convertir el valor numérico leído a un carácter
            char letra = (char) caracter;
            System.out.println(letra);

            // Mientras no se alcance el final del archivo (indicado por -1)
            while (caracter != -1) {
                // Imprimir el carácter leído
                System.out.print(letra);
                // Leer el siguiente carácter del archivo
                caracter = entrada.read();
                // Convertir el nuevo valor numérico a un carácter
                letra = (char) caracter;
            }

        } catch (Exception e) {
            // Imprimir la pila de errores en caso de que ocurra una excepción
            e.printStackTrace();
        }
    }
}
