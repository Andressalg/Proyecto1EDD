/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto1.Grafos;

/**
 * Esta clase representa un arco en un grafo.
 */

public class Arco {
    Object destino;
    public Arco siguiente;
    
    /**
     * Constructor que recibe un parámetro y lo fija como destino.
     *
     * @param d el destino del arco
     */
    public Arco(Object d){  
        destino = d;
        siguiente = null;
    }
    
}
