/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto1.Grafos;

import java.util.*;

class Grafo<T> {
    private Map<T, List<T>> map = new HashMap<>();

    public void addVertex(T vertex) {
        map.put(vertex, new LinkedList<>());
    }

    public void addEdge(T source, T destination, boolean bidirectional) {
        if (!map.containsKey(source)) {
            addVertex(source);
        }
        if (!map.containsKey(destination)) {
            addVertex(destination);
        }
        map.get(source).add(destination);
        if (bidirectional) {
            map.get(destination).add(source);
        }
    }
    

  
    }
