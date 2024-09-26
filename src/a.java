import java.util.ArrayList;
import java.util.Scanner;

public class a{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int opcion = -1;
        ArrayList<Alumno> alumnos = new ArrayList<Alumno>();
        while(opcion != 0){
            System.out.println("\nIngrese una opcion: ");
            System.out.println("1. anadir un nuevo alumno");
            System.out.println("2.Mostrar lista de alumnos");
            opcion = input.nextInt();
            switch(opcion){
                case 1:{
                    Alumno alumno = new Alumno();

                    System.out.println("Ingrese el DNI del pibe: ");
                    alumno.DNI = input.nextInt();
                    System.out.println("Ingrese el apellido del pibe: ");
                    alumno.apellido = input.next();
                    System.out.println("Ingrese el nombre del pibe");
                    alumno.nombre = input.next();
                    System.out.println("Ingrese la edad del pibe: ");
                    alumno.edad = input.nextInt();
                    System.out.println("Ingrese el promedio del pibe: ");
                    alumno.promedio = input.nextDouble();
                    alumnos.add(alumno);
                    break;
                }
                case 2:{
                    System.out.println("Listado de alumnos");
                    float promedio = 0;
                    for(Alumno a: alumnos){
                        promedio += a.edad;
                        System.out.printf("DNI: %d\tApellido: %s\tNombre: %s\tEdad: %d\n", a.DNI, a.apellido, a.nombre, a.edad);
                    }
                    System.out.printf("\nTotal de alumnos: %d\n", alumnos.size());

                    if(alumnos.size() != 0) System.out.printf("El promedio de edad es: %f", (promedio/alumnos.size()));

                }



            }

        }
        input.close();
    }
}

class Alumno{
    int DNI;
    String apellido;
    String nombre;
    int edad;
    double promedio;
    Alumno(){};
    Alumno(int dni, String apellido, String nombre, int edad, double promedio){
        this.DNI = dni;
        this.apellido = apellido;
        this.nombre = nombre;
        this.edad = edad;
        this.promedio = promedio;

    }
}
