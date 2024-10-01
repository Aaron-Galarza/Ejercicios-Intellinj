package Herencia;

public class Principal {
    public static void main(String[] args){

        Auto a = new Auto();

        Moto m = new Moto();

        m.acelerar();
        m.hacerWellei();

        a.prenderAire();

        m.setMarca("yamaha");

    }
}
