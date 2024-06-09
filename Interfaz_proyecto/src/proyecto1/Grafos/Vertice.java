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
   public Lista ListaAdyacencia;

    public Vertice(String Id) {
        this.Id = Id;
        this.Letra = Letra;
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

    public Lista getListaAdyacencia() {
        return ListaAdyacencia;
    }

    public void setListaAdyacencia(Lista ListaAdyacencia) {
        this.ListaAdyacencia = ListaAdyacencia;
    }
    
    /**
     * Agrega una arista entre el vértice actual y el vértice de destino.
     * @param verticeFin El vértice de destino.
     */
    public void addArista(Vertice verticeFin) {
        this.ListaAdyacencia.addAtStart(verticeFin);
        verticeFin.ListaAdyacencia.addAtStart(this);
    }

/**
     * Elimina una arista entre el vértice actual y el vértice de destino.
     * @param verticeFin El vértice de destino.
     */
    public void removeArista(Vertice verticeFin) {
        this.ListaAdyacencia.empty(verticeFin);
        verticeFin.ListaAdyacencia.empty(this);
    }

    }
