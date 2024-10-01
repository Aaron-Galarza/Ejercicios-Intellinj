package Herencia;

import javax.jws.soap.SOAPBinding;

public class Principal {
    public static void main(String[] args){

        Auto a = new Auto("Yamaha", "Ninja", "ABCD123");
        Auto c = new Auto("Toyota", "Hilux", "HGF123", true);

        Moto m = new Moto();

        //Generalizacion
        Vehiculo a2 = new Auto("Yamaha", "Ninja", "ABCD123");
        Vehiculo a3 = a;


        m.acelerar();
        m.hacerWellei();

        a.prenderAire();

        m.setMarca("yamaha");

        System.out.println(a);
        System.out.println(c);

    }
}
