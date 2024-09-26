package Clases.Ejercicio1;

public class Ejercicio1 {
    public static void main(String[] args){

        Cuenta cuenta1 = new Cuenta("Aaron");
        cuenta1.setCantidad(15000);

        Cuenta cuenta2 = new Cuenta(25000);
        cuenta2.setTitular("Facundo");

        String alias = cuenta1.getTitular();
        System.out.println(alias);

        cuenta1.MostrarDatos();
        cuenta2.MostrarDatos();

        cuenta1.ingresar();
        cuenta1.retirar();

        cuenta1.MostrarDatos();

    }
}
