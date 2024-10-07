package Estructuras.Lineales.Pila.Ejemplo1;

import java.util.Stack;

public class Pilas {
    public static void main(String[] args){

        //Declarar una coleccion tipo "pila" (Stack)
        Stack<Integer> pila = new Stack<Integer>();

        //Por el polimorfismo al mencionar solo la coleccion se sobreescribe en forma re toString
        System.out.println("Pila vacia " + pila);

        //Metodo para saber si una pila está vacia o no (true o false)
        System.out.println("Está vacia? " + pila.isEmpty());

        //Para agregar las pilas tienen su propio metodo, no es el ".add" de otras colecciones
        pila.push(1);
        pila.push(2);
        pila.push(3);
        pila.push(4);
        pila.push(5);

        //Recorrido
        for (Integer x : pila){
            System.out.println(x);
        }

        System.out.println("Está vacia? " + pila.isEmpty());

        System.out.println("Pila con elementos: " + pila);

        //Metodo para eliminar el ULTIMO REGISTRO QUE ENTRO A LA PILA
        pila.pop();

        //Me sirve para saber a cuentos elementos este el elemento buscado de la parte superior de la pila
        //Ejemplo: 3 está a 2 elementos por debajo del final
        System.out.println(pila.search(3));

        //Ejemplo: 2 está a 3 elementos por debajo del final
        System.out.println(pila.search(2));

        //Metodo para saber cual es el ultimo elemento de la lista
        System.out.println(pila.peek());

    }


}
