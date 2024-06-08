/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Estructura;

/**
 *Esta clase representa un nodo en una estructura de datos.
 * @param <T> el tipo de datos almacenados en el nodo.
 * @author edgar
 */
public class Node<T> {
    
    private T data;
    private Node<T> pNext; 
    
    /**
     * Constructor para la clase Node.
     * Inicializa el dato y el nodo siguiente.
     * @param data el dato a almacenar en el nodo.
     */
    public Node (T data){
        this.data = data;
        this.pNext = null;
    }

    /**
     * Este método devuelve el dato almacenado en el nodo.
     * @return el dato almacenado en el nodo.
     */
    public T getData() {
        return data;
    }

    /**
     * Este método establece el dato del nodo.
     * @param data el dato a establecer.
     */
    public void setData(T data) {
        this.data = data;
    }

    /**
     * Este método devuelve el siguiente nodo.
     * @return el siguiente nodo.
     */
    public Node<T> getpNext() {
        return pNext;
    }

    /**
     * Este método establece el siguiente nodo.
     * @param pNext el siguiente nodo a establecer.
     */
    public void setpNext(Node<T> pNext) {
        this.pNext = pNext;
    } 
    
}
