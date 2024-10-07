package Estructuras.Lineales.Cola;

import java.util.LinkedList;
import java.util.Queue;

public class Cola {
    public static void main(String[] args){

        //Para instanciar una cola se hace con un LinkedList
        Queue<Integer> cola = new LinkedList<Integer>();

        System.out.println("La cola está vacia? " + cola.isEmpty());
        System.out.println("La cola es:" + cola);

        //Agregar elementos a la cola
        cola.add(1);
        cola.add(2);
        cola.add(3);

        System.out.println("La cola es:" + cola);

        //para poder ver el PRIMER elemento se usa el metodo peak
        System.out.println("El primer elemento es: " + cola.peek());

        //Para eliminar el primer elemento de la cola se usa poll
        cola.poll();

        System.out.println("La cola está vacia? " + cola.isEmpty());
        System.out.println("El nuevo primer elemento es: " + cola.peek());
        System.out.println("La cola es:" + cola);


    }
}
