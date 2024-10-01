package Arraylist.Colecciones.Algoritmos;

import java.util.ArrayList;

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

//    public void mostrarAutos(){
//        if (autos.isEmpty()) {
//            System.out.println("No hay autos");
//        } else {
//            for (int i = 0; i < autos.size(); i++) {
//                System.out.println("El auto en la posicion N° " + i + " es " + autos.get(i));
//            }
//        }
//    }

    public void mostrarAutos(){

        for ( Auto a : autos ) {

            System.out.println(a);

        }
    }

    public int totalKm(){

        int acum = 0;

        for (Auto a : autos){

            acum += a.getKm();

        }

        return acum;
    }

    public int cantAutos(){
        return autos.size();
    }

    public double kmPromedio(){

        return (double) totalKm() / cantAutos();
    }

    public Auto autoMayorKm(){

        Auto autoMay = null;
        double MaxKm = -1;

        for (Auto a : autos){

            if (a.getKm() > MaxKm){

                MaxKm = a.getKm();
                autoMay = a;
            }

        }

        return autoMay;
    }

    public Auto autoMenorKm(){

        Auto autoMin = null;
        double minKm = Integer.MAX_VALUE;

        for (Auto a : autos){

            if (a.getKm() < minKm){

                minKm = a.getKm();
                autoMin = a;
            }

        }

        return autoMin;
    }


}
