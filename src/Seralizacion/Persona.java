package Seralizacion;

import java.io.Serializable;

public class Persona implements Serializable {

    private static final long serialVersionUID = 1L; // Identificador de versión para la serialización

    private  String nombre; // Nombre de la persona
    private int edad; // Edad de la persona
    private transient int password; // Contraseña, no se serializa

    public Persona(String nombre, int edad, int password){
        this.nombre = nombre;
        this.edad = edad;
        this.password = password;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }

}
