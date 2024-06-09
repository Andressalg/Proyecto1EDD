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

    public Grafo(boolean esPesadoinput) {
        this.vertices = new Lista<Vertice>();
        this.esPesado = esPesadoinput;
    }

         /**
     *
     * @author Buste
     * agrega un Vertice a la lista
     */
    public Vertice addVertice(String data){
        Vertice newVertice = new Vertice(data);
        this.vertices.addAtStart(newVertice);
        return newVertice;
    }

    /**
     * Agrega una arista entre dos vértices.
     * @param vertice1 El primer vértice.
     * @param vertice2 El segundo vértice.
     */
    public void addArista(Vertice vertice1, Vertice vertice2){
            vertice1.addArista(vertice2);
            vertice2.addArista(vertice1);
        }

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
        vertice1.removeArista(vertice2);

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

}
