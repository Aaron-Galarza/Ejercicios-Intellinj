package Matrices;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la dimension de la matriz cuadrada");
        int Dimension = sc.nextInt();

        int Filas = Dimension;
        int Columnas = Dimension;

        int Matriz[][] = new int[Filas][Columnas];

        for (int i = 0; i < Filas; i++) {
            for (int j = 0; j < Columnas; j++) {

                if (i == j) {

                    Matriz[i][j] = 1;

                } else {
                    Matriz[i][j] = 0;
                }

            }
        }

        for (int i = 0; i < Filas; i++) {
            for (int j = 0; j < Columnas; j++) {

                System.out.print(Matriz[i][j]);

            }
            System.out.println();
        }


    }
}
