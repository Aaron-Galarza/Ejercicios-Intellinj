package Herencia.Ejemplo3UpDown;

    public class Auto extends Vehiculo {
    boolean tieneAire;

    public Auto(String marca, String modelo, String patente){
        super(marca, modelo, patente);
    }

    public Auto(){
        super();
    }

     public Auto(String marca, String modelo, String patente, boolean tieneAire) {
         super(marca, modelo, patente);
         this.tieneAire = tieneAire;
     }

     void prenderAire(){
        if (tieneAire){
            System.out.println("Encendiendo aire...");
        } else {
            System.out.println("Este auto no tiene aire...");
        }
    }
}
