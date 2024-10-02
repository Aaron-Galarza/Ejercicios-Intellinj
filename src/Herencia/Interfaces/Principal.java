package Herencia.Interfaces;

public class Principal {
    public static void  main(String[] args){

        PartidoDelBuenCodigo A = new PartidoDelBuenCodigo();

        A.agregarMensajeros(new CorreoElectronico());
        A.agregarMensajeros(new MensajeTelefonico());

        A.hacerMensaje();

    }
}
