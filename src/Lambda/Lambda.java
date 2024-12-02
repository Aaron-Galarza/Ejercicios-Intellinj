package Lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda {
    public static void main(String[] args){

        // Lambda vacia sobre una variable que imprime un mensaje simple
        Runnable imprimirMensaje = () -> System.out.println("¡Hola, Lambda sin argumentos!");

        // Ejecutar la expresión
        imprimirMensaje.run();

        // Crea una lista de números enteros del 1 al 10
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Utiliza un Stream para procesar la lista
        List<Integer> pares = numeros.stream() // Convierte la lista en un Stream para operaciones funcionales
                .filter(n -> n % 2 == 0) // Filtra los números pares
                .collect(Collectors.toList()); // Recolecta los números pares en una nueva lista

        // Imprime la lista resultante con los números pares
        System.out.println(pares);


    }
}