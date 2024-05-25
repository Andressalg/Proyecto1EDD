/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto1.Grafos;

/**
 *
 * @author Buste
 */
public class Traverso {
    
    public static void DepthFirstSearch(Vertice inicio, ListaSimplementeEnlazada<Vertices>, VVisitados){
        System.out.println(inicio.getData());
        
        for (Aristas a: inicio.getAristas()) {
           Vertice vecino = a.getFinal();
           
           if(!VVisitados.contains(vecino)) {
               VVisitados.addAtStart(vecino);
               Traverso.DepthFirstSearch(vecino, VVisitados);
           }
        }
    
    }
    
}
