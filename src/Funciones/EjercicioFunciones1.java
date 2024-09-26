package Funciones;

import java.util.Scanner;

public class EjercicioFunciones1 {

    public static void main(String[] args){

        String nombre = PedirNombre();
        Saludo(nombre);
        System.out.println(Producto());
    }

    static String PedirNombre(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su nombre por favor");

        String nombre = sc.nextLine();
        return nombre;
    }

    static String Saludo(String nombre){
        System.out.println("Hola señor/ar " + nombre + " que tenga un lindo dia");

        return "puto";
    }

    static double Producto(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        double x = sc.nextDouble();
        System.out.println("Ingrese otro numero");
        double y = sc.nextDouble();
        return x*y;
    }

}
