package Matrices;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de filas");
        int Filas = sc.nextInt();

        System.out.println("Ingrese la cantidad de columnas");
        int Columnas = sc.nextInt();

        int Matriz[][] = new int[Filas][Columnas];

        for (int i = 0; i < Filas; i++) {
            for (int j = 0; j < Columnas; j++) {

                System.out.println("Ingrese el valor del elemento a" + i + j);
                Matriz[i][j] = sc.nextInt();

            }
        }

        System.out.println("La es... Emmm no se no se entiende viva peron:  ");

        for (int i = 0; i < Filas; i++) {
            for (int j = 0; j < Columnas; j++) {

                System.out.print(Matriz[i][j]);

            }
            System.out.println();
        }



    }
}
