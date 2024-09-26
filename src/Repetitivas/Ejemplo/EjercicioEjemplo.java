package Repetitivas.Ejemplo;

import java.util.Scanner;

public class EjercicioEjemplo {
    public static void main(String[] args){

        String tarjeta;
        double pago;
        int cuotas;
        double interes = 0;
        double total;

        Scanner sc = new Scanner(System.in);


        do {
            System.out.println("Ingrese el valor del producto");
            pago = sc.nextInt();

            if (pago <= 0){
                System.out.println("Monto no valido, es inferior a 0, ingrese uno superior a 0.");
            }
            else {


                do {
                    System.out.println("Ingrese la tarjeta que desea usar (black o shark)");
                    tarjeta = sc.next();

                    if (tarjeta.equals("black")) {
                        System.out.println("Esta tarjeta tiene un 2% apartir del 7ma cuota");
                        System.out.println("Las opciones de cuotas para la tarjeta shark son: ");
                        System.out.println("3 cuotas sin interes");
                        System.out.println("6 cuotas sin interes");
                        System.out.println("9 cuotas con interes");
                        System.out.println("12 cuotas con interes");


                        do{
                            cuotas = sc.nextInt();

                            if (cuotas != 3 && cuotas != 6 && cuotas != 9 && cuotas != 12) {
                                System.out.println("Cuotas ingresadas no validas, intentelo otra vez");

                            } else if (cuotas == 3 || cuotas == 6) {
                                System.out.println("No se aplican intereses para esta cantidad de cuotas");

                            } else {
                                switch (cuotas) {
                                    case 9:
                                        interes = (pago * 0.02) * 9;
                                        break;
                                    case 12:
                                        interes = (pago * 0.02) * 12;
                                        break;
                                }
                            }

                        } while (cuotas != 3 && cuotas != 6 && cuotas != 9 && cuotas != 12);


                    } else if (tarjeta.equals("shark")) {
                        System.out.println("Esta tarjeta tiene un 1% apartir de la 3ra cuota");
                        System.out.println("Las opciones de cuotas para la tarjeta shark son: ");
                        System.out.println("1 cuotas sin interes");
                        System.out.println("3 cuotas sin interes");
                        System.out.println("6 cuotas con interes");
                        System.out.println("9 cuotas con interes");
                        System.out.println("12 cuotas con interes");

                        do{
                            cuotas = sc.nextInt();

                            if (cuotas != 1 && cuotas != 3 && cuotas != 6 && cuotas != 9 && cuotas != 12) {
                                System.out.println("Cuotas ingresadas no validas, intentelo otra vez");

                            } else if (cuotas == 1) {
                                System.out.println("No se aplican intereses para esta cantidad de cuotas");

                            } else {
                                switch (cuotas) {
                                    case 3:
                                        interes = (pago * 0.01) * 3;
                                        break;
                                    case 6:
                                        interes = (pago * 0.01) * 6;
                                        break;
                                    case 9:
                                        interes = (pago * 0.01) * 9;
                                        break;
                                    case 12:
                                        interes = (pago * 0.01) * 12;
                                        break;
                                }
                            }

                        } while (cuotas != 3 && cuotas != 6 && cuotas != 9 && cuotas != 12);

                    } else {
                        System.out.println("ingrese una tarjeta valida");
                    }

                }while (!tarjeta.equals("black") && !tarjeta.equals("shark"));

            }

        } while (pago <= 0);

        total = pago + interes;
        System.out.println("El total a pagar es: " + total);

    }
}