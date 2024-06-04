/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;
import proyecto1.Listas.ListaSimplementeEnlazada;
import proyecto1.Grafos.Grafo;
import proyecto1.Grafos.Vertice;
        
/**
 *
 * @author salom
 */
public class SopaDeLetras {
    private ListaSimplementeEnlazada<String> diccionario;
    private char[][] tablero;
    private Grafo grafo; 

    public SopaDeLetras(ListaSimplementeEnlazada<String> diccionario, char[][] tablero) {
        this.diccionario = diccionario;
        this.tablero = tablero;
        this.grafo = new Grafo(false, false);
        crearGrafo();
    }
    
    public SopaDeLetras(ListaSimplementeEnlazada<String> diccionario,
            ListaSimplementeEnlazada<ListaSimplementeEnlazada<Character>> tableroLista){
        this.diccionario = diccionario;
        generarTablero(tableroLista);
        this.grafo = new Grafo(false, false);
        crearGrafo();
    }

    public SopaDeLetras() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public ListaSimplementeEnlazada<String> getDiccionario() {
        return diccionario;
    }

    public void setDiccionario(ListaSimplementeEnlazada<String> diccionario) {
        this.diccionario = diccionario;
    }

    public char[][] getTablero() {
        return tablero;
    }

    public void setTablero(char[][] tablero) {
        this.tablero = tablero;
    }
    
    private void agregarAristas(Vertice vertice, int fila, int columna){
        if (fila> 0){
            Vertice vecinoArriba = new Vertice((fila - 1) + "," + columna);
            vertice.addArista(vecinoArriba, 1);
        }
        
        if (fila < this.tablero.length - 1) {
        Vertice vecinoAbajo = new Vertice((fila + 1) + "," + columna);
        vertice.addArista(vecinoAbajo, 1);
        }
        
        // Agregar arista al vecino de la izquierda, si existe
        if (columna > 0) {
            Vertice vecinoIzquierda = new Vertice(fila + "," + (columna - 1));
            vertice.addArista(vecinoIzquierda, 1);
        }
        
        // Agregar arista al vecino de la derecha, si existe
        if (columna < this.tablero[fila].length - 1) {
            Vertice vecinoDerecha;
            vecinoDerecha = new Vertice(fila + "," + (columna + 1));
            vertice.addArista(vecinoDerecha, 1);
        }
    }
    
    
    private void crearGrafo(){
        for (int i = 0; i < this.tablero.length; i++){
            for(int j = 0; j < this.tablero[i].length; j++){
                Vertice vertice = this.grafo.addVertice(i + "," + j);
                agregarAristas(vertice, i, j);
            }
        }
    }
        
    /**
    * Metodo para generar el tablero de la sopa de letras a partir de la informacion
    * proporcionada.
    * @param tableroLista
    */

    public void generarTablero(ListaSimplementeEnlazada<ListaSimplementeEnlazada<Character>> tableroLista){
        int filas = tableroLista.getSize();
        int columnas = tableroLista.get(0).getSize();
        this.tablero = new char [filas][columnas];
        
        for (int i = 0; i < filas; i++){
            ListaSimplementeEnlazada<Character> fila = tableroLista.get(i);
            
            for(int j = 0; j < columnas; j++){
                tablero[i][j] = fila.get(j).charValue();
            }
        }
    }

}

