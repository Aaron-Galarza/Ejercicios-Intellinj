package Repetitivas.Ejemplo;

import java.util.Scanner;

public class EjercicioEjemplo3  {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int total = 0;
        System.out.println("Quiere sumar numeros? si/no");
        String r = sc.next();

        for (int i = 0; i <= 1; i++) {

            if (r.equals("si")) {

                System.out.println("ingrese el numero");
                int num = sc.nextInt();
                total += num;

                System.out.println("Quiere ingresar mas numeros? si/no");
                r = sc.next();
                if (r.equals("si")) {
                    i = 0;
                    continue;
                }
                else {
                    break;
                }
            }

        }

        System.out.println("El resultado de todas las sumas es: " + total);

    }

    private static String getX() {
        return "desea ingresar numeros? si/no ";
    }
}
