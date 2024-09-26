package Funciones.Ejemplo;

import java.util.Scanner;

public class EjemploFunciones {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el numero del cual quiera conocere su siguiente");

        int num =sc.nextInt();
        int x = Siguiente(num);
        System.out.println(x);

        }
        static int Siguiente(int num) {

        return num + 1;
    }
}
