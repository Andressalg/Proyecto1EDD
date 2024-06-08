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
   public String Id;
   public String Letra;
   public Vertice ApuntadorDerecha;
   public Vertice ApuntadorIzquierda;
   public Lista ListaAdyacencia;

    public Vertice(String Id) {
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

    public Vertice getApuntadorDerecha() {
        return ApuntadorDerecha;
    }

    public void setApuntadorDerecha(Vertice ApuntadorDerecha) {
        this.ApuntadorDerecha = ApuntadorDerecha;
    }

    public Vertice getApuntadorIzquierda() {
        return ApuntadorIzquierda;
    }

    public void setApuntadorIzquierda(Vertice ApuntadorIzquierda) {
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
    
       /**
 *
 * @author Buste
 * borra el vertice dado en el paramtero
       * @param verticeFin
 */
    public void removeVertice(Vertice verticeFin){
        this.removeVertice(verticeFin);
    }

    }
