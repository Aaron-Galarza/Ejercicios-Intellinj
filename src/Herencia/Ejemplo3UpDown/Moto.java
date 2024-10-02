package Herencia.Ejemplo3UpDown;

 public class Moto extends Vehiculo {
    int anchoManubrio;

    public Moto(String marca, String modelo, String patente){
        super(marca, modelo, patente);
    }

    public Moto(){
        super();
    }

    void hacerWellei(){
        System.out.println("Haciendo wallei...");
    }


}
