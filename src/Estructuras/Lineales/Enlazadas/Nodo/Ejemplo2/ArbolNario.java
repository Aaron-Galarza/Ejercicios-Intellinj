package Estructuras.Lineales.Enlazadas.Nodo.Ejemplo2;

import java.util.Scanner;

public class ArbolNario {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //creamos un abrol N-ario con la raiz
        NodoNario raiz = new NodoNario(1);

        //creamos los hijos de esta raiz
        NodoNario hijo1 = new NodoNario(2);
        NodoNario hijo2 = new NodoNario(3);
        NodoNario hijo3 = new NodoNario(4);

        //agregamos los hijos a su raiz
        raiz.agregarHijo(hijo1);
        raiz.agregarHijo(hijo2);
        raiz.agregarHijo(hijo3);

        //podemos agregarle hijos a esos hijos (nietos de la raiz)
        hijo1.agregarHijo(new NodoNario(5));
        hijo2.agregarHijo(new NodoNario(6));
        hijo2.agregarHijo(new NodoNario(7));
        hijo3.agregarHijo(new NodoNario(8));
        hijo3.agregarHijo(new NodoNario(9));
        hijo3.agregarHijo(new NodoNario(10));

        //imprimimos el arbol en preorden
        System.out.println("recorrido en Pre-orden");
        raiz.imprimirPreorden();

        //imprimimos el arbol en posorden
        System.out.println("recorrido en Pos-orden");
        raiz.imprimirPosorden();

        //imprimimos la altura del arbol
        int altura = raiz.altura();
        System.out.println("la altura del arbol es " + altura);

        //buscamos un valor especifico del arbol
        System.out.println("ingrese un valor del arbol que quisera buscar: ");
        int valor = sc.nextInt();
        boolean buscado = raiz.buscar(valor);
        System.out.println("el valor " + valor + " dentro del arbol es: " + buscado);

    }
}
