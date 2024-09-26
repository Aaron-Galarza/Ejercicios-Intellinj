package EjerciciosProgramacionTeoria;

import java.util.Scanner;

public class EjercicioMatriz1 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el valor de la dimension cuadrada que tendra ambas matrices");
        int dimension = sc.nextInt();

        int filas = dimension;
        int columnas = dimension;

        int [][] matrizA = new int[filas][columnas];
        int [][] matrizB = new int[filas][columnas];


        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {

                System.out.println("Ingrese el valor a" + i+j + " de la matrizA");
                matrizA[i][j] = sc.nextInt();

            }

        }

        System.out.println("La primera matriz es:  ");

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {

                System.out.print(matrizA[i][j]);

            }
            System.out.println();
        }

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {

                System.out.println("Ingrese el valor a" + i+j + " de la matrizB");
                matrizB[i][j] = sc.nextInt();

            }

        }

        System.out.println("La Segunda matriz es:  ");

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {

                System.out.print(matrizB[i][j]);

            }
            System.out.println();
        }

    }
}
