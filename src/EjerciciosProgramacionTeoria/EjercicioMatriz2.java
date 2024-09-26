package EjerciciosProgramacionTeoria;

import java.util.Arrays;
import java.util.Scanner;

public class EjercicioMatriz2 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el valor de la dimension que tendra la matriz cuadrada: ");
        int dimension = sc.nextInt();

        int filas = dimension;
        int columnas = dimension;

        int [][] matriz = new int[filas][columnas];


        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {

                System.out.println("Ingrese el valor a" + i+j + " de la matriz");
                matriz[i][j] = sc.nextInt();

            }

        }

        System.out.println("La matriz es:  ");

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {

                System.out.print(matriz[i][j]);

            }
            System.out.println();
        }

        System.out.println();

        int k = 0;
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (matriz[i][j] % 2 == 0) {
                    k++;
                }
            }
        }


        int[] arreglo = new int[k];
        int x = 0;

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (matriz[i][j] % 2 == 0) {
                    arreglo[x] = matriz[i][j];
                    x++;
                }

            }
            
        }

        System.out.println("El arreglo que muestra los numeros pares de manera desordenada es: " + Arrays.toString(arreglo));

        int z = 0;
        for (int i = 0; i < k; i++) {
            if (arreglo[i] > arreglo[i + 1]) {
                arreglo[z] = arreglo[i];
                z++;
            } else {
                arreglo[z] = arreglo[i +1];
                z++;
            }


        }

        System.out.println("El arreglo que muestra los numeros pares de manera desordenada es: " + Arrays.toString(arreglo));


    }
}
