package Matrices;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de filas de la primera matriz");
        int Filas1 = sc.nextInt();

        System.out.println("Ingrese la cantidad de columnas de la primera matriz");
        int Columnas1 = sc.nextInt();

        int Matriz1[][] = new int[Filas1][Columnas1];

        for (int i = 0; i < Filas1; i++) {
            for (int j = 0; j < Columnas1; j++) {

                System.out.println("Ingrese el valor del elemento a" + i + j);
                Matriz1[i][j] = sc.nextInt();

            }
        }

        System.out.println();

        System.out.println("Ingrese la cantidad de filas de la segunda matriz");
        int Filas2 = sc.nextInt();

        System.out.println("Ingrese la cantidad de columnas de la segunda matriz");
        int Columnas2 = sc.nextInt();

        int Matriz2[][] = new int[Filas2][Columnas2];

        for (int i = 0; i < Filas2; i++) {
            for (int j = 0; j < Columnas2; j++) {

                System.out.println("Ingrese el valor del elemento a" + i + j);
                Matriz2[i][j] = sc.nextInt();

            }
        }

        System.out.println("La primera matriz es:  ");

        for (int i = 0; i < Filas1; i++) {
            for (int j = 0; j < Columnas1; j++) {

                System.out.print(Matriz1[i][j]);

            }
            System.out.println();
        }

        System.out.println("La segunda matriz es:  ");

        for (int i = 0; i < Filas2; i++) {
            for (int j = 0; j < Columnas2; j++) {

                System.out.print(Matriz2[i][j]);

            }
            System.out.println();
        }

        if (Columnas1 == Filas2 || Columnas2 == Filas1) {

            int Filas3 = 0;
            int Columnas3 = 0;
            int MatrizP[][] = new int[Filas3][Columnas3];

            //Matriz1 * Matriz2
            if (Columnas1 == Filas2) {

                for (int i = 0; i < Filas2; i++) {
                    for (int j = 0; j < Columnas1; j++) {
                        for (int k = 0; k < Columnas1; k++) {

                            MatrizP[i][j] = Matriz1[i][k] * Matriz2[k][j];

                        }


                    }
                    System.out.println();
                }

            }
            //Matriz2 * Matriz1
            else if (Columnas2 == Filas1) {

                Filas3 = Filas2;
                Columnas3 = Columnas1;


            }

            for (int i = 0; i < Filas3; i++) {
                for (int j = 0; j < Columnas3; j++) {



                }
                System.out.println();
            }


        }

    }
}
