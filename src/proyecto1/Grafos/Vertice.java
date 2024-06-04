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
    
    /**
 *
 * @author Buste
 * agrega una arista al principio de la lista
 */
    public void addArista (Vertice verticeFin, int peso){
        this.aristas.addAtStart(new Arista(this, verticeFin ,peso));
    }
    
       /**
 *
 * @author Buste
 * borra el vertice dado en el paramtero
 */
    public void removeVertice(Vertice verticeFin){
       if(this.aristas ==  aristas.getLast().equals(verticeFin));{
        verticeFin = null;
    }
    }
       /**
 *
 * @author Buste
 * @return the data
 */
    public String getData(){
        return this.data;
    }
    
       /**
 *
 * @author Buste
 * @return the arista
 * 
 */
    public ListaSimplementeEnlazada<Aristas> getAristas(){
        return this.aristas;
    }
    
    
}
