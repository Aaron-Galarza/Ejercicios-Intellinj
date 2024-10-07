package Estructuras.Lineales.Enlazadas.Nodo;

public class Nodo {

    //El valor del elemento que queres poner en el nodo
    private int dato;

    //Referencia al siguiente nodo
    private Nodo siguiente;

    //La referencia al siguiente siempre sera nula al momento de crear un nodo nuevo
    public Nodo(int dato) {
        this.dato = dato;
        this.siguiente = null;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }
}
