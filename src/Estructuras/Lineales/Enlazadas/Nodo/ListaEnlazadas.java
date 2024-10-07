package Estructuras.Lineales.Enlazadas.Nodo;

//"Lista" que va a ir enlazando los nodo uno por uno
public class ListaEnlazadas {

    //Primer Nodo de la lista
    private Nodo cabeza;

    //Constructor de la lista, cuando creo una lista nueva está comenzara con un nodo raiz vacio
    public ListaEnlazadas(){
        this.cabeza = null;
    }

    public void agregarNodo(int valor){

        //Inicializamos un nodoNuevo con el valor a agregar
        Nodo nodoNuevo = new Nodo(valor);

        if (cabeza == null){

            //Si la lista está vacia el valor se le agregar a la cabeza
            cabeza= nodoNuevo;

        } else {

            //Hacemos una "copia" de cabeza
            Nodo actual = cabeza;

            //sino buscamos en la referencia del ultimo nodo con contenido
            while (actual.getSiguiente() != null) {

                actual = actual.getSiguiente();
                //este bucle, va pasando por todos lo nodos que se crearon a traves de sus enlaces (getSiguiente)

            }

            actual.setSiguiente(nodoNuevo);
        }
    }
}
