package Clases.Ejemplo;

import java.util.Scanner;

//nombre de la clase
public class CuentaBancaria {

    //atributos de la clase, son privados para que no se puedan modificar directamente, unicamente se podrian modificar utilizando metodos propios de la clase//
    private String CBU;
    private String alias;
    private double saldo;

    Scanner sc = new Scanner(System.in);

    //metodos de la clase

    //Metodo Constructor donde ya se cargan datos de manera manual
    public CuentaBancaria(String alias, double saldo) {
        this.CBU = generarCBU();
        this.alias = alias;
        this.saldo = saldo;
    }

    //Metodo constructor donde no es necesario cargar datos, estos se pueden cargar despues
    public CuentaBancaria(){

    }

    //metodos no devuelven un valor, solo se ejecutan, las funciones si devuelven un valor
    void getDatos() {
        System.out.println(CBU + " " + alias + " " + saldo);
    }

    private String generarCBU() {

        return "123456789987654321";

    }

    //Metodo que salta el alias, no lo muestra, pero se lo puede asignar a una variable
    String getAlias() {
        return alias;
    }

    //Metodo que establece un alias
    void setAlias() {

        do {

            System.out.println("Ingrese el alias que quisiera tener: ") ;
            String alias = sc.next();

            if (isNumeric(alias)) {
                System.out.println("No puede tener un alias con numeros, por favor intentelo otra vez");
            } else {
                //el this hace referencia a la variable utilizada como atributo, si no tuviera "this" se uniria a la variable "alias" de la funcion, y no a la de la clase
                this.alias = alias;
                break;
            }

        }while (true);

    }


    //metodo que establece un valor para depositar
    void setDepositar(){

        do {

            System.out.println("Ingrese un monto a depositar: ");
            double monto = sc.nextDouble();

            if (monto <= 0) {

                System.out.println("Ingrese un valor superior a 0");

            } else {

                saldo += monto;
                break;

            }

        } while (true);
    }


    //metodo que establece un valor a extraer
    void setExtraer(){

        do {

            System.out.println("Ingrese un monto a extraer: ");
            double monto = sc.nextDouble();

            if (saldo == 0) {

                System.out.println("Usted no tiene saldo para extraer");
               break;

            } else if (monto >= 0) {

                if (saldo >= monto) {

                    saldo -= monto;
                    break;

                } else {
                    System.out.println("Saldo insuficiente, está intentando extraer mas de lo que tiene");

                }
            }

        } while (true);
    }

    // Método para verificar si la entrada es numérica
    public static boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}


