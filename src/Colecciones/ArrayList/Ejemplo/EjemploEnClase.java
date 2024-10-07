package Colecciones.ArrayList.Ejemplo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class EjemploEnClase {

        static Scanner sc = new Scanner(System.in);

        public static void main(String[] args) {

            // Clase 21/05/24 Martes

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


        }

    }
