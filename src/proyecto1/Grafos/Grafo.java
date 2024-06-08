/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto1.Grafos;
import proyecto1.Listas.Lista;


   /**
 *
 * @author Buste
 * 
 */
class Grafo {
public Lista vertices;
public boolean esPesado;
public boolean esDirigido;

public Grafo(boolean esPesadoinput, boolean esDirigidoinput ) {
    this.vertices = new Lista<Vertice>();
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
    this.vertices.addAtStart(data);
    return newVertice;
}

   /**
 *
 * @author Buste
 * agrega una Arista a la lista

   /**
 *
 * @author Buste
 * borra un vertice de la lista
 */
public void removeVertice(Vertice vertice){
        this.vertices.empty(vertice);
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

public Lista<Vertice> getVertices(){
    return this.vertices;
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
    }
