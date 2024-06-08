/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto1.Grafos;
import proyecto1.Listas.Lista;
/**
 *
 * @author Buste
 */
public class Vertice {
  public Vertice(String data) {
    }
   public class Nodo {
   public String Id;
   public String Letra;
   public Nodo ApuntadorDerecha;
   public Nodo ApuntadorIzquierda;
   public Lista ListaAdyacencia;

    public Nodo(String Id, String Letra) {
        this.Id = Id;
        this.Letra = Letra;
        this.ApuntadorDerecha = null;
        this.ApuntadorIzquierda = null;
        this.ListaAdyacencia = new Lista();
        
    }
    
    

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public String getLetra() {
        return Letra;
    }

    public void setLetra(String Letra) {
        this.Letra = Letra;
    }

    public Nodo getApuntadorDerecha() {
        return ApuntadorDerecha;
    }

    public void setApuntadorDerecha(Nodo ApuntadorDerecha) {
        this.ApuntadorDerecha = ApuntadorDerecha;
    }

    public Nodo getApuntadorIzquierda() {
        return ApuntadorIzquierda;
    }

    public void setApuntadorIzquierda(Nodo ApuntadorIzquierda) {
        this.ApuntadorIzquierda = ApuntadorIzquierda;
    }

    public Lista getListaAdyacencia() {
        return ListaAdyacencia;
    }

    public void setListaAdyacencia(Lista ListaAdyacencia) {
        this.ListaAdyacencia = ListaAdyacencia;
    }
    
      /**
 *
 * @author Buste
 * agrega una arista al principio de la lista
       * @param verticeFin
 */
    public void addArista (Vertice verticeFin, int peso){
        this.addAtStart(new Aristas(this, verticeFin ,peso));
    }
    
       /**
 *
 * @author Buste
 * borra el vertice dado en el paramtero
 */
    public void removeVertice(Vertice verticeFin){
       if(this.Aristas ==  Aristas.getLast().equals(verticeFin));{
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
    public Lista<Aristas> getAristas(){
        return this.Aristas;
}
    
    
    
    
    }
  
    
}
