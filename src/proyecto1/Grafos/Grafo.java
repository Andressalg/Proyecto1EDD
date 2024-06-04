/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto1.Grafos;
import proyecto1.Listas.ListaSimplementeEnlazada;


   /**
 *
 * @author Buste
 * 
 */
class Grafo {
private ListaSimplementeEnlazada<Vertice> vertices;
private boolean esPesado;
private boolean esDirigido;

public Grafo(boolean esPesadoinput, boolean esDirigidoinput ) {
    this.vertices = new ListaSimplementeEnlazada<Vertice>();
    this.esPesado = esPesadoinput;
    this.esDirigido = esDirigidoinput;
}

     /**
 *
 * @author Buste
 * agrega un Vertice a la lista
 */
public Vertice addVertice(String data){
    Vertice newVertice = new Vertice(data);
    this.vertices.AddAtStart(newVertice);
    return newVertice;
}

   /**
 *
 * @author Buste
 * agrega una Arista a la lista
 */
public void addArista(Vertice vertice1, Vertice vertice2, int peso){
    if (!this.isEsPesado()){
        peso = 0;
    }
    vertice1.addArista(vertice2, peso);
    if(!this.isEsDirigido()){
        vertice2.addArista(vertice1, peso);
    }
}
   /**
 *
 * @author Buste
 * borra una Arista de la lista
 */
public void removeArista(Vertice vertice1, Vertice vertice2){
    vertice1.removeVertice(vertice2);
    if(!this.isEsDirigido()){
        vertice2.removeVertice(vertice1);
    }
}
   /**
 *
 * @author Buste
 * borra un vertice de la lista
 */
public void removeVertice(Vertice vertice){
        this.vertices.empty(vertice);
}

public ListaSimplementeEnlazada<Vertice> getVertices(){
    return this.vertices
}

    /**
     * @return the esPesado
     */
    public boolean isEsPesado() {
        return esPesado;
    }

    /**
     * @return the esDirigido
     */
    public boolean isEsDirigido() {
        return esDirigido;
    }
    
       /**
 *
 * @author Buste
 * busca el vertice dado segun su valor
 */
    public Vertice getVerticeByValue(String valor) {
        for(Vertice v: this.vertices) {
            if(v.getData().equals(valor)){
                return v;
                
            }
        }
    }


    }
