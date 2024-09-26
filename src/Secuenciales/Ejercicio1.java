package Secuenciales;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la distancia a recorrer en kilometros");

        int distancia = sc.nextInt();
        double precio = distancia * 45;

        System.out.println("El precio del boleto es: $" + precio);
        sc.close();
        System.out.println("Gracias y que tenga un buen viaje :)");
    }
}
