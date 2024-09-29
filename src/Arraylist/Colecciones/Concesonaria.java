package Arraylist.Colecciones;

import Arraylist.Auto;

import java.util.ArrayList;
import java.util.Collection;

public class Concesonaria {

    private String nombre;
    private ArrayList<Auto> autos;

    public Concesonaria(String nombre) {
        this.nombre = nombre;
        this.autos = new ArrayList<>();
    }

    public void addAuto(Auto a){
        this.autos.add(a);
    }

    public void mostrarAutos(){
        if (autos.isEmpty()) {
            System.out.println("No hay autos");
        } else {
            for (int i = 0; i < autos.size(); i++) {
                System.out.println("El auto en la posicion N° " + i + " es " + autos.get(i));
            }
        }
    }
}
