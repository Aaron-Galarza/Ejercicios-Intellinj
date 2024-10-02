package Herencia.Interfaces;

public class CorreoElectronico implements EnviadorDeMensajes {

    @Override
    public void enviarMensajes(String mensaje) {

        System.out.println("Enviado por Gmail.com: " + mensaje);

    }

}
