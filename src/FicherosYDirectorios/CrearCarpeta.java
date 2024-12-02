package FicherosYDirectorios;

import java.io.File;
import java.util.Scanner;

public class CrearCarpeta {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el nombre del carpeta que quiera crear: ");
        String carpetaNombre = sc.nextLine();

        System.out.println("Ingrese la ruta donde desea crear la nueva carpeta: ");
        String ruta = sc.nextLine();

        File carpeta = new File(ruta + carpetaNombre);

        carpeta.mkdir();
    }
}
