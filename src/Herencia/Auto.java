package Herencia;

 class Auto extends Vehiculo {
    boolean tieneAire;

    void prenderAire(){
        if (tieneAire){
            System.out.println("Encendiendo aire...");
        } else {
            System.out.println("Este auto no tiene aire...");
        }
    }
}
