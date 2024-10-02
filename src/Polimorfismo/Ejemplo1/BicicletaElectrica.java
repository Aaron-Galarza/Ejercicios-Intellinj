package Polimorfismo.Ejemplo1;

public class BicicletaElectrica extends Vehiculo {

    public void prenderPantalla(){
        System.out.println("Pantalla prendida");
    }

    public void energizarMotor(){
        System.out.println("Motor listo");
    }

    @Override
    public void encender(){
        prenderPantalla();
        energizarMotor();
    }

}
