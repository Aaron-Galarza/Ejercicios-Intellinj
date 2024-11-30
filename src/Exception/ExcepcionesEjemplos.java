package Exception;
import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.io.FileReader;
import java.io.IOException;

public class ExcepcionesEjemplos {
    public static void main(String[] args){

        //EJEMPLOS DE RUNTIME EXCEPTIONS

        String nombre = null;
        int longitud = nombre.length();  // Lanzará NullPointerException

        int[] numeros = {1, 2, 3, 4, 5};
        System.out.println(numeros[5]);  // Lanzará ArrayIndexOutOfBoundsException, porque el índice 5 está fuera del rango

        int resultado = 10 / 0;  // Lanzará ArithmeticException (división por cero)

        Object obj = "Texto";
        Integer numero = (Integer) obj;  // Lanzará ClassCastException, ya que no se puede convertir un String en Integer

        establecerEdad(-5);  // Lanzará IllegalArgumentException: La edad no puede ser negativa.

        //EJEMPLOS DE IOException

        // Ejemplo 1: Manejo de IOException y FileNotFoundException al leer un archivo inexistente
        try {
            // Intenta abrir un archivo llamado "archivo_inexistente.txt"
            FileReader file = new FileReader("archivo_inexistente.txt");

            // Lee un carácter del archivo
            int data = file.read();

            // Convierte el carácter leído a char y lo imprime
            System.out.println((char) data);

            // Cierra el archivo
            file.close();

        } catch (FileNotFoundException e) {
            // Maneja la excepción si el archivo no se encuentra
            System.out.println("El archivo no existe.");
        } catch (IOException e) {
            // Maneja cualquier otro error relacionado con E/S
            System.out.println("Error de entrada/salida.");
        }

        // Ejemplo 2: Manejo de EOFException al leer datos de un archivo binario
        try {
            // Intenta abrir un archivo binario llamado "archivo.dat"
            FileInputStream fis = new FileInputStream("archivo.dat");
            DataInputStream dis = new DataInputStream(fis);

            // Lee enteros del archivo en un bucle infinito
            while (true) {
                System.out.println(dis.readInt()); // Lee y muestra un entero
            }

        } catch (EOFException e) {
            // Maneja la excepción cuando se alcanza el final del archivo
            System.out.println("Se alcanzó el final del archivo.");
        } catch (IOException e) {
            // Maneja cualquier otro error relacionado con E/S
            System.out.println("Error de entrada/salida.");
        }

        //EJEMPLOS DE SQLException

        try {
            // Intentamos conectar a una base de datos
            Connection connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/nombre_base_datos", "usuario", "contraseña");

            // Creamos una sentencia SQL
            Statement statement = connection.createStatement();

            // Ejecutamos una consulta SQL
            ResultSet resultSet = statement.executeQuery("SELECT * FROM tabla_inexistente");

            // Iteramos sobre los resultados (no se alcanzará si hay un error en la consulta)
            while (resultSet.next()) {
                System.out.println("Resultado: " + resultSet.getString("columna"));
            }

        } catch (SQLException e) {
            // Capturamos cualquier error relacionado con SQL
            System.out.println("Error al interactuar con la base de datos: " + e.getMessage());
        }

        //EJEMPLOS DE ParseException

        String fechaInvalida = "31-02-2024"; // Fecha inválida (no existe el 31 de febrero)
        SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");

        try {
            // Intentamos analizar la fecha en el formato indicado
            Date fecha = formato.parse(fechaInvalida);
            System.out.println("Fecha válida: " + fecha);

        } catch (ParseException e) {
            // Capturamos el error si la fecha no cumple con el formato esperado
            System.out.println("Error al analizar la fecha: " + e.getMessage());
        }

        //EJEMPLO DE Throws

        // Ejemplo de uso del método con throws
        try {
            leerArchivo("archivo.txt");
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }


    }

    // Método con throws para manejar IOException
    public static void leerArchivo(String ruta) throws IOException {
        FileReader entrada = new FileReader(ruta); // Puede lanzar IOException
        int caracter;
        while ((caracter = entrada.read()) != -1) {
            System.out.print((char) caracter); // Imprimir el contenido
        }
        entrada.close();
    }

    public static void establecerEdad(int edad) {
        if (edad < 0) {
            throw new IllegalArgumentException("La edad no puede ser negativa.");
        }
        System.out.println("Edad establecida: " + edad);
    }

}
