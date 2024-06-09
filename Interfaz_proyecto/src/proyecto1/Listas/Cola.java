/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto1.Listas;

/**
 *
 * @author salom
 */
public class Cola {
    private NodoCola primero ;
    private NodoCola atras;
    private int size;

    public Cola() {
        this.primero = null;
        this.atras = null;
        this.size = 0;
    }
    
    /**
     * Agrega un elemento al final de la cola
     * @param data El elemento a agregar
     */
    public void encolar(Object data) {
        NodoCola nuevoNodo = new NodoCola(data);
        if (primero == null) {
            primero = atras = nuevoNodo;
        } else {
            atras.setNext(nuevoNodo);
            atras = nuevoNodo;
        }
        size++;
    }

    /**
     * Elimina y retorna el elemento del frente de la cola
     * @return El elemento del frente de la cola
     */
    public Object desencolar() {
        if (primero == null) {
            return null;
        }
        Object data = primero.getData();
        primero = primero.getNext();
        if (primero == null) {
            atras = null;
        }
        size--;
        return data;
    }

    /**
     * Verifica si la cola está vacía.
     * @return true si la cola está vacía, false en caso contrario.
     */
    public boolean isEmpty() {
        return primero == null;
    }

    /**
     * Obtiene el tamaño actual de la cola.
     * @return El tamaño de la cola.
     */
    public int getSize() {
        return size;
    }
}
