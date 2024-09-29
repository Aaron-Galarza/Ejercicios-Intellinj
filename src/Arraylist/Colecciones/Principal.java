package Arraylist.Colecciones;

import Arraylist.Auto;

public class Principal {
    public static void main(String[] args){

        Concesonaria c = new Concesonaria("FakeCar");

        c.mostrarAutos();

        c.addAuto(new Auto("ABCD", "Rojo"));
        c.addAuto(new Auto("RTYU", "Verde"));
        c.addAuto(new Auto("QWER", "Azul"));

        c.mostrarAutos();

    }
}
