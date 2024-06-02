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
    public static void BreadthFirstSearch(Vertice inicio,ListaSimplementeEnlazada<Vertices>, VVisitados ){
        ListaSimplementeEnlazada Visitados = new ListaSimplementeEnlazada();
        Visitados.addAtStart(inicio);
        while (!Visitados.isEmpty()){
            Vertice current = Visitados.SetSize(int 0);
            
            for (Arista e: current.getAristas()){
               Vertice vecino = e.getFinal();
               if (VVisitados.contains(vecino)){
                VVisitados.addAtEnd(vecino);
                visitados.addAtEnd(vecino);
            }
               
            }
        }
        
    }
    
    
    
    
}
