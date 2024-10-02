package Herencia.Interfaces;

public class MensajeTelefonico implements EnviadorDeMensajes{

    @Override
    public void enviarMensajes(String mensaje) {

        System.out.println("Enviado por SMS: " + mensaje);

    }

}
