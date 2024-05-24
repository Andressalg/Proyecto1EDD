/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto1.Grafos;
import proyecto1.Listas.ListaSimplementeEnlazada;
/**
 *
 * @author Buste
 */
public class Vertice {
    private String data;
    private ListaSimplementeEnlazada<Aristas> Arista;
   
    public Vertice(String data){
        this.data = data;
        this.aristas = new ListaSimplementeEnlazada<Aristas>(0);
    }
    
    public void addArista (Vertice verticeFin, int peso){
        this.aristas.addAtStart(new Arista(this, verticeFin ,peso));
    }
    
    public void removeVertice(Vertice verticeFin){
       if(this.aristas ==  aristas.getLast().equals(verticeFin));{
        verticeFin = null;
    }
    }
    
    public String getData(){
        return this.data;
    }
    
    public ListaSimplementeEnlazada<Aristas> getAristas(){
        return this.aristas;
    }
    
    
}
