package Clases.Ejemplo;

import java.util.Scanner;

public class Cuentas {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //inicializo una variable "cuenta" con la clase "CuentaBancaria" ulitilizando el constructor de carga de atributos
        CuentaBancaria cuenta = new CuentaBancaria("Facu", 1000);

        //inicializo una variable "cuenta2" con la clase "CuentaBancaria" utilizando el constructor sin carga de atributos
        CuentaBancaria cuenta2 = new CuentaBancaria();

        //Muestro datos nulos con el metodo "mostrarDatos" que construi adentro de la clase
        cuenta.getDatos();

        cuenta2.getDatos();

        //Ingreso un alias para la cuenta
        cuenta.setAlias();

        cuenta2.setAlias();

        //Muestro datos nuevos
        cuenta.getDatos();

        //Ingreso un monto con el metodo "depositar" que construi adentro de la clase
        cuenta.setDepositar();

        //Muestro datos nuevos
        cuenta.getDatos();

        //Ingreso un monto con el metodo "extraer" que construi adentro de la clase
        cuenta.setExtraer();

        //Muestro datos nuevos
        cuenta.getDatos();

        //Le asigno a la variable "alias" el valor que retorna la funcion "obtenerAlias"
        String alias = cuenta.getAlias();
        System.out.println(alias);


    }
}

