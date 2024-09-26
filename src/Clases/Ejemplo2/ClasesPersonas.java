package Clases.Ejemplo2;

import java.util.Scanner;

public class ClasesPersonas {

    private String nombre;
    private String apellido;
    private int edad;
    private boolean tieneHijos = false;

    Scanner sc = new Scanner(System.in);

    public ClasesPersonas(String nombre, String apellido, int edad, boolean tieneHijos){

        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.tieneHijos = tieneHijos;

    }

    public ClasesPersonas() {

    }

    void  mostrarDatos() {

        System.out.println(nombre + " " + apellido + " " + edad + " " + tieneHijos);

    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre() {
        do {

            System.out.println("Ingrese su nombre: ");
            String nombre = sc.next();

            if (isNumeric(nombre)) {

                System.out.println("Su nombre no puede tener numeros, por favor intentelo otra vez");

            } else {

                this.nombre = nombre;
                break;

            }

        } while (true);

    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido() {

        do {

            System.out.println("Ingrese su apellido: ");
            String apellido = sc.next();

            if (isNumeric(apellido)) {

                System.out.println("Su apellido no puede tener numeros, por favor intentelo otra vez");

            } else {

                this.apellido = apellido;
                break;

            }

        } while (true);

    }

    public int getEdad() {
        return edad;
    }

    public void setEdad() {

        System.out.println("Ingrese su edad: ");
        this.edad = sc.nextInt();

    }


    public boolean isTieneHijos() {
        return tieneHijos;
    }

    public void setTieneHijos() {
        System.out.println("Usted tiene hijos? si/no");
        String respuesta = sc.next();

        if (respuesta.equals("si")) {

            this.tieneHijos = true;

        }

    }

    @Override
    public String toString() {
        return "ClasesPersonas{ " +
                "edad=" + edad +
                ", tieneHijos=" + tieneHijos +
                ", apellido='" + apellido + '\'' +
                ", nombre='" + nombre + '\'' +
                '}';
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
