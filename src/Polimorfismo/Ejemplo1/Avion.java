package Polimorfismo.Ejemplo1;

public class Avion extends Vehiculo {

    public void calefaccionarCarburador(){
        System.out.println("Carburador listo");
    }

    public void regularMezclaDeCombustible(){
        System.out.println("Mezcla regulada");
    }

    public void inyectarCombustible(){
        System.out.println("Combustible intectado");
    }

    public void masPasos(){
        System.out.println("Muchos pasos más...");
    }

    @Override
    public void encender(){
        calefaccionarCarburador();
        regularMezclaDeCombustible();
        inyectarCombustible();
        masPasos();
    }


}
