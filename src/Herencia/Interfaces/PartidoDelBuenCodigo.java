package Herencia.Interfaces;

import java.util.ArrayList;

public class PartidoDelBuenCodigo {
    private ArrayList<EnviadorDeMensajes> mensajeros;

    //Constructor
    public PartidoDelBuenCodigo() {
        mensajeros = new ArrayList<>();
    }

    public void agregarMensajeros(EnviadorDeMensajes a){
        mensajeros.add(a);
    }

    public void hacerMensaje(){
        for (EnviadorDeMensajes mensajes : mensajeros){
            mensajes.enviarMensajes("Vota por nuestro partido");
        }

    }
}
