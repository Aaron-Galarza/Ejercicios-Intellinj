package Estructuras.Lineales.Enlazadas.Nodo.Ejemplo2;

import java.util.ArrayList;
import java.util.List;

public class NodoNario {

    int valor;
    List<NodoNario> hijos;

    //Constructor para crear un nodo con un valor.
    public NodoNario(int valor){
        this.valor = valor;
        hijos = new ArrayList<>();
    }

    //Metodo para agregar un hijo a este nodo.
    public void agregarHijo(NodoNario hijo){
        hijos.add(hijo);
    }

    //Metodo recursivo para imprimir el arbol en preorden (padre --> hijos)
    public void imprimirPreorden(){
        System.out.println(valor + " ");
        for (NodoNario hijo : hijos){
            hijo.imprimirPreorden();
        }
    }

    //Metodo recursivo para imprimir el arbol en posorden (hijos --> padre)
    public void imprimirPosorden(){
        for (NodoNario hijo : hijos){
            hijo.imprimirPosorden();
        }
        System.out.println(valor + " ");
    }

    // Método para determinar la altura del árbol (longitud del camino más largo desde la raíz hasta una hoja)
    public int altura() {

        // Caso base: Si el nodo actual no tiene hijos, es una hoja
        if (hijos.isEmpty()) {
            return 1; // La altura de una hoja es 1 porque no tiene niveles adicionales debajo de ella
        }

        int alturaMax = 0; // Variable para almacenar la mayor altura encontrada entre los subárboles de los hijos

        // Recorrer todos los hijos del nodo actual
        for (NodoNario hijo : hijos) {
            // Llamada recursiva al método 'altura()' para calcular la altura del subárbol de cada hijo
            // Math.max se asegura de que siempre almacenemos la altura más grande encontrada
            alturaMax = Math.max(alturaMax, hijo.altura());
        }

        // Después de calcular la altura máxima de los hijos, sumamos 1 para incluir el nivel del nodo actual
        return alturaMax + 1;
    }

    //metodo para buscar un valor especifico
    public boolean buscar(int valorBuscado) {

        // Compara el valor del nodo actual con el valor buscado
        if (valor == valorBuscado) {
            return true; // Si coinciden, retorna true
        }

        // Recorre los hijos del nodo actual
        for (NodoNario hijo : hijos) {
            // Llama recursivamente al método en cada hijo
            if (hijo.buscar(valorBuscado)) {
                return true; // Si algún hijo encuentra el valor, retorna true
            }
        }

        // Si el valor no está en el nodo actual ni en sus hijos, retorna false
        return false;
    }


}
