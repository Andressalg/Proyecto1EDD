/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto1.Grafos;

/**
 * Esta clase representa un nodo en un grafo.
 * @author Buste
 */
public class NodoGrafo {
    public Object dato;
    ListaAdyacencia lista;
    public NodoGrafo siguiente;
    
    /**
     * Constructor para la clase NodoGrafo.
     * Inicializa el dato, la lista de adyacencia y el nodo siguiente.
     * @param x el dato a almacenar en el nodo.
     */
    public NodoGrafo(Object x){
        dato = x;
        lista = new ListaAdyacencia();
        siguiente = null;
    }

    
}
