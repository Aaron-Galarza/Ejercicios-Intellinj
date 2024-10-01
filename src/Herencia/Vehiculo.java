package Herencia;

public class Vehiculo {

    private String marca;
    private String modelo;
    private String patente;

    public void acelerar(){
        System.out.println("Acelerando...");
    }

    public void frenar(){
        System.out.println("Frenando...");
    }

    private void cheaquearMotor() {
        System.out.println("Chequeando el motor...");
    }

    public void encender(){
        cheaquearMotor();
        System.out.println("Encendiendo...");
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }
}
