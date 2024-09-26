package Repetitivas;

import com.sun.org.apache.xpath.internal.operations.Div;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el numero que quiera verificar si es primo o no");

        int Num = sc.nextInt();
        int Divisor = 2;

        do {

           if (Num % Divisor == 0){

               if (Num == Divisor){

                   System.out.println("El numero " + Num + " es primo");
                   Divisor = Divisor + 1;
               }
               else {

                   System.out.println("El numero " + Num + " NO es primo porque es divisible por " + Divisor);
                   Divisor = Divisor + 1;
               }

           }
           else {

               while (Num % Divisor != 0){

                   Divisor = Divisor + 1;

               }

           }
        } while (Num % Divisor == 0);

    }
}
