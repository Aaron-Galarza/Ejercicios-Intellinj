package Herencia;

import Herencia.UpcastingDowncasting.Concesionaria;

public class Principal {
    public static void main(String[] args){

        Auto a = new Auto("Yamaha", "Ninja", "ABCD123");
        Auto c = new Auto("Toyota", "Hilux", "HGF123", true);

        Moto m = new Moto();

        m.acelerar();
        m.hacerWellei();

        a.prenderAire();

        m.setMarca("yamaha");

        System.out.println(a);
        System.out.println(c);

        //Generalizacion
        Vehiculo p = new Auto("Yamaha", "Ninja", "ABCD123");

        Concesionaria d = new Concesionaria();

        d.agregarVehiculo(new Auto("Yamaha", "Ninja", "ABCD123"));
        d.agregarVehiculo(new Moto());

        System.out.println(d);

        //Generalizar - Upcasting
        Vehiculo v = a;

        //Especificar - Downcasting
        Auto a2 = (Auto) v;

        a2.prenderAire();

    }
}
