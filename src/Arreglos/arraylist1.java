package Arreglos;
import java.util.*;

public class arraylist1 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        // Clase 21/05/24 Martes
        // Ingresar y quitar elementos de arraylist

        // Se carga una lista conformada por enteros

        int[] enteros = {1, 4, 3, 2, 5};
        System.out.println(Arrays.toString(enteros));

        // Se crea una copia de dicha lista
        int[] copia = Arrays.copyOf(enteros, enteros.length);

        // Se ordena la copia de la lista
        Arrays.sort(copia);

        // Se busca un valor especifico de la copia ordenada
        int indice = Arrays.binarySearch(copia, 3);

        // Muestra el elemento buscado y muestra la lista original
        System.out.println("El elemento está en la ubicación: " + indice);
        String[] nombres;

        // Se crea un arraylist
        ArrayList<String> ListaNombres = new ArrayList <String>();

        ListaNombres.add("a");
        ListaNombres.add("b");
        ListaNombres.add("c");

        /*
        ListaNombres.add(index:2, element:"test");

        Stack<Integer> pila = new Stack <Integer>();
        // Metodos de pilas : push, pop, peek

        // pop saca el ultimo elemento ingresado
        pila.push(item:10);
        pila.push(item:20);
        System.out.println(pila.peek());
        // peek toma el ultimo elemento
        pila.pop();

        Queue<Integer> cola = new Queue<Integer>();
        */

    }

}