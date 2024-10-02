package Polimorfismo.Ejemplo1;

public class Principal {
    public static void main(String[] args){
//        probar(new Vehiculo());
        probar(new Avion());
        probar(new BicicletaElectrica());
    }

    public static void probar(Vehiculo v){
        v.encender();
    }
}
