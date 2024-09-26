package Repetitivas;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el numero al que quiera sumar sus digitos");

        int Num = sc.nextInt();
        int aux = Num;
        int Digito = 0;
        int Suma = 0;

        do {

            Digito = Num % 10;
            System.out.println("El digito es: " + Digito);
            Num = Num / 10;
            Suma = Suma + Digito;

        }  while(Num > 0);

        System.out.println("La suma de todos los digitos de " + aux + " es de: " + Suma);

    }
}
