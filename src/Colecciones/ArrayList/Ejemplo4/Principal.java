package Colecciones.ArrayList.Ejemplo4;

public class Principal {
    public static void main(String[] args){


        Concesonaria a = new Concesonaria("FakeCar");

        a.mostrarAutos();

        a.addAuto(new Auto("ABCD", "Rojo", 2000));
        a.addAuto(new Auto("RTYU", "Verde", 1000));
        a.addAuto(new Auto("QWER", "Azul", 3000));

        a.mostrarAutos();

        System.out.println("El total de km de todos los autos de la concesonaria es de " + a.totalKm());

        System.out.println();

        System.out.println("El promedio de km de todos los autos es de " + a.kmPromedio());

        System.out.println();

        System.out.println("El auto con mayor kilometros recorrido es el " + a.autoMayorKm());

        System.out.println();

        System.out.println("El auto con mayor kilometros recorrido es el " + a.autoMenorKm());
    }
}
