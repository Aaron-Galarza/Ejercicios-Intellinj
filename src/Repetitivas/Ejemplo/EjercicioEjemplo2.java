package Repetitivas.Ejemplo;

import java.util.Scanner;

public class EjercicioEjemplo2 {
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            String producto;
            double precioTotal = 0;

            do {
                System.out.println("Los productos disponibles son: peppa, sirenita, stitch, bob esponja, chavo y leon");
                producto = scanner.nextLine().toLowerCase();

                if (isNumeric(producto)) {
                    System.out.println("Pone letras por favor");
                } else if (producto.equals("peppa") || producto.equals("sirenita") || producto.equals("stitch") || producto.equals("bob esponja") || producto.equals("chavo") || producto.equals("leon")) {
                    switch (producto) {
                        case "peppa":
                            precioTotal += 3500;
                            break;
                        case "sirenita":
                            precioTotal += 5000;
                            break;
                        case "stitch":
                            precioTotal += 6000;
                            break;
                        case "bob esponja":
                            precioTotal += 8000;
                            break;
                        case "chavo":
                            precioTotal += 5000;
                            break;
                        case "leon":
                            precioTotal += 4000;
                            break;
                    }
                    System.out.println("Desea llevar algo más (si/no)?");
                    String respuesta = scanner.nextLine().toLowerCase();

                    if (!respuesta.equals("si")) {
                        break;
                    }

                } else {
                    System.out.println("Producto no válido. Inténtelo de nuevo.");
                }

            } while (true);

            System.out.println("El precio total es: " + precioTotal);
            scanner.close();
        }

        // Método para verificar si la entrada es numérica
        public static boolean isNumeric(String str) {
            try {
                Double.parseDouble(str);
                return true;
            } catch (NumberFormatException e) {
                return false;
            }
        }
    }

