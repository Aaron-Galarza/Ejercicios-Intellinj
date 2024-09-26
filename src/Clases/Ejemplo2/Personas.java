package Clases.Ejemplo2;

import java.util.Scanner;

public class Personas {
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args){

        ClasesPersonas Persona1 = new ClasesPersonas("Aaron", "Galarza", 19, true);
        ClasesPersonas Persona2 = new ClasesPersonas();

        Persona1.mostrarDatos();

        Persona2.mostrarDatos();

        Persona2.setNombre();
        Persona2.setApellido();
        Persona2.setEdad();
        Persona2.setTieneHijos();

        Persona2.mostrarDatos();

        System.out.println(Persona2.toString());

    }




}
