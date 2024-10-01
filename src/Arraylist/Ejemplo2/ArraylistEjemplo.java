package Arraylist.Ejemplo2;


import java.util.ArrayList;

public class ArraylistEjemplo {
    public static void main(String[] args){

        Auto a1 = new Auto("123456789", "rojo");
//        Auto a2 = new Auto("987654321", "verde");
//        Auto a3 = new Auto("987321654", "azul");

        ArrayList<Auto> misAutos = new ArrayList<>();

        misAutos.add(a1);
        System.out.println(misAutos.size());
        System.out.println(misAutos);

        System.out.println();
        misAutos.add(new Auto("987654321", "verde"));
        System.out.println(misAutos.size());
        System.out.println(misAutos);

        System.out.println();
        misAutos.add(new Auto("987321654", "azul"));
        System.out.println(misAutos.size());
        System.out.println(misAutos);

        System.out.println();
        System.out.println("El 2do auto de la lista es: " + misAutos.get(1));

        System.out.println();
        for (int i = 0; i < misAutos.size(); i++) {

            System.out.println("El auto en la posicion n° " + i + " es " + misAutos.get(i));

        }

        System.out.println();

        misAutos.remove(a1);
        System.out.println(misAutos.size());
        System.out.println(misAutos);

        System.out.println();

        misAutos.remove(1);
        System.out.println(misAutos.size());
        System.out.println(misAutos);

        //Finalizacion del ejemplo

    }
}
