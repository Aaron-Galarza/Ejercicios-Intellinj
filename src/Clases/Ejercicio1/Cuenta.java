package Clases.Ejercicio1;

import java.util.Scanner;

public class Cuenta {

    String titular;
    double cantidad;

    Scanner sc = new Scanner(System.in);

   //***constructores***///
    public Cuenta () {

    }

    public Cuenta (String titular, double cantidad) {
        this.titular = titular;
        this.cantidad = cantidad;
    }

    public Cuenta (String titular){
        cantidad = 0;
        this.titular = titular;
    }

    public Cuenta (double cantidad){
        titular = "SinNombre";
        this.cantidad = cantidad;
    }
    //*********//

   //***getters y setters***//

    public void MostrarDatos(){
        System.out.println(titular + " " + cantidad);
    }

    public String getTitular (){
       return titular;
   }
   public void setTitular (String titular) {
       this.titular = titular;
   }

   public double getCantidad() {
       return cantidad;
   }

   public void setCantidad (double cantidad){
       this.cantidad = cantidad;
   }
   //*********//

   //***metodos***///
   public void ingresar(){

        do {

            System.out.println("Ingrese un monto para ingresar");
            double monto = sc.nextDouble();
            if (monto < 0) {
                System.out.println("Monto a ingresar no valido, ingrese un valor positivo");

            }else {
                cantidad += monto;
                break;
            }

        }while (true);

   }

   public void retirar(){

       do {

           System.out.println("Ingrese un monto para retirar");
           double monto = sc.nextDouble();

           if (monto < 0) {
               monto *= -1;
           }

           cantidad -= monto;

           if (cantidad < 0){
               cantidad = 0;
           }

           break;

       }while (true);

   }


}
