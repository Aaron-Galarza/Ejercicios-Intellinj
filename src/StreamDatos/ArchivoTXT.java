package StreamDatos;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class ArchivoTXT {
    public static void main(String[] args) {

        // Crear una instancia de la clase ArchivoTXT para acceder al método LeerArchivos
        ArchivoTXT lector = new ArchivoTXT();
        // Llamar al método LeerArchivos pasando la ruta del archivo como argumento
        lector.LeerArchivos("C:/Users/Usuario/Desktop/Aaron/UTN-TUP/Programacion/StreamEjemplos/Holajeje.txt");

        System.out.println();

        ArchivoTXT escritor = new ArchivoTXT();
        escritor.EscribirArchivos("C:/Users/Usuario/Desktop/Aaron/UTN-TUP/Programacion/StreamEjemplos/Holajeje.txt");

        // Llamar al método LeerArchivos pasando la ruta del archivo como argumento
        lector.LeerArchivos("C:/Users/Usuario/Desktop/Aaron/UTN-TUP/Programacion/StreamEjemplos/Holajeje.txt");

        System.out.println();

    }

    public void EscribirArchivos(String ruta) {
        // Crear un objeto Scanner para leer entrada del usuario
        Scanner sc = new Scanner(System.in);

        // Pedir al usuario que ingrese el texto que se escribirá en el archivo
        System.out.println("Ingrese el texto que desea escribir en un archivo: ");
        String texto = sc.nextLine(); // Capturar el texto ingresado por el usuario

        try {
            // Crear un objeto FileWriter para escribir en el archivo especificado por la ruta
            FileWriter escritura = new FileWriter(ruta);

            // Recorrer cada carácter del texto ingresado
            for (int i = 0; i < texto.length(); i++) {
                escritura.write(texto.charAt(i)); // Escribir carácter por carácter en el archivo
            }

            // Cerrar el FileWriter para guardar los cambios y liberar recursos
            escritura.close();

        } catch (Exception e) {
            // Manejar cualquier excepción que pueda ocurrir (por ejemplo, problemas con la ruta del archivo)
            e.printStackTrace();
        }
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
