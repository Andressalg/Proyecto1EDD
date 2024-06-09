/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import proyecto1.Listas.Cola;
import proyecto1.Listas.ListaSimplementeEnlazada;
import proyecto1.Listas.NodoBFS;
import proyecto1.Listas.NodoCola;
import proyecto1.Listas.NodoDiccionario;

/**
 * Clase para manejar las busquedas de palabras en el tablero utilizando algoritmos
 * de busqueda como el BFS y el DFS
 * @author salom
 */
public class SopaDeLetras {
    private Matriz tablero;
    private ListaSimplementeEnlazada Diccionario;
    
    /**
     * Construye una instacia de <code>SopaDeLetras</code> utiliazndo la matriz 
     * y el diccionario de la clase <code>Global</code>
     */
    public SopaDeLetras() {
        this.tablero = Global.getMatriz();
        this.Diccionario = Global.getListaPalabras();
    }
    
    public ListaSimplementeEnlazada buscarPalabraDFS() {
        //Se crea una nueva lista para guardar las palabras encontradas
        ListaSimplementeEnlazada palabrasEncontradas = new ListaSimplementeEnlazada();
        //Se crea una matriz de booleanos para saber cuales son las celdas visitadas
        boolean [][] visitados = new boolean[tablero.getNumFilas()]
                [tablero.getNumColumnas()];
        //recorre cada celda del tablero
        for(int fila = 0; fila < tablero.getNumFilas(); fila++){
            for(int columna = 0; columna < tablero.getNumColumnas(); columna++){
                //llama al metodo dfs para cada celda
                dfs(fila,columna,"", visitados, palabrasEncontradas);
            }
        }
        //devuelve la lista de palabras encontradas
        return palabrasEncontradas;
    }
    
    /**
     * 
     * @param fila  fila actual de la celda
     * @param columna   columna actual de la celda
     * @param palabraActual 
     * @param visitados la matriz de booleanos para indica las celdas ya visitadas
     * @param palabrasEncontradas lista de palabras encontradas
     */
    private void dfs(int fila, int columna, String palabraActual, boolean[][] 
            visitados, ListaSimplementeEnlazada palabrasEncontradas){
        //Verifica si la celda actual esta fuera de los limites o si ya fue visitada
        if(fila < 0|| fila >= tablero.getNumFilas()|| columna < 0 || columna 
                >= tablero.getNumColumnas()|| visitados[fila][columna]){
            return;
        }
        
        palabraActual += tablero.getMatrizAdyacencia()[fila][columna].getLetra();
        if(palabraActual.length() >= 3 && Diccionario.PalabraEnDiccionario(palabraActual)){
            palabrasEncontradas.AddAtEnd(new Palabra(palabraActual));
        }
        
        visitados[fila][columna] = true;
        dfs(fila - 1, columna, palabraActual, visitados, palabrasEncontradas);
        dfs(fila + 1, columna, palabraActual, visitados, palabrasEncontradas);
        dfs(fila, columna - 1, palabraActual, visitados, palabrasEncontradas);
        dfs(fila, columna + 1, palabraActual, visitados, palabrasEncontradas);
        visitados[fila][columna] = false; 
    }
    
public ListaSimplementeEnlazada buscarPalabraBFS() {
    ListaSimplementeEnlazada palabrasEncontradas = new ListaSimplementeEnlazada();
    boolean[][] visitados = new boolean[Global.getMatriz().getNumFilas()][Global.getMatriz().getNumColumnas()];
    Cola cola = new Cola();

    for (int fila = 0; fila < Global.getMatriz().getNumFilas(); fila++) {
        for (int columna = 0; columna < Global.getMatriz().getNumColumnas(); columna++) {
            Palabra palabraInicial = new Palabra(String.valueOf(Global.getMatriz().getMatrizAdyacencia()[fila][columna].getLetra()));
            PalabraConPosicion palabraConPosicion = new PalabraConPosicion(palabraInicial, fila, columna);
            NodoCola nodoCola = new NodoCola(palabraConPosicion);
            cola.encolar(nodoCola);
            visitados[fila][columna] = true;
            bfs(cola, visitados, palabrasEncontradas);
        }
    }
    return palabrasEncontradas;
}

private NodoBFS bfs(Cola cola, boolean[][] visitados, Palabra palabraABuscar) {
    NodoBFS raiz = new NodoBFS(new PalabraConPosicion(palabraABuscar, 0, 0));
    cola.encolar(new NodoCola(raiz));
    visitados[0][0] = true;

    while (!cola.isEmpty()) {
        NodoCola nodoCola = (NodoCola) cola.desencolar();
        NodoBFS nodoActual = (NodoBFS) nodoCola.getData();
        PalabraConPosicion palabraConPosicion = nodoActual.getPalabraConPosicion();
        Palabra palabraActual = palabraConPosicion.getPalabra();
        int filaActual = palabraConPosicion.getFila();
        int columnaActual = palabraConPosicion.getColumna();
        StringBuilder sb = new StringBuilder(palabraActual.getPalabra());

        // Verificar si la palabra actual es igual a la palabra a buscar
        if (palabraActual.getPalabra().equals(palabraABuscar.getPalabra())) {
            // La palabra a buscar ha sido encontrada
            return raiz;
        } else {
            // Buscar en las celdas vecinas
            for (int i = -1; i <= 1; i++) {
                for (int j = -1; j <= 1; j++) {
                    if (i != 0 || j != 0) {
                        int nuevaFila = filaActual + i;
                        int nuevaColumna = columnaActual + j;
                        if (nuevaFila >= 0 && nuevaFila < Global.getMatriz().getNumFilas() && nuevaColumna >= 0 && nuevaColumna < Global.getMatriz().getNumColumnas() && !visitados[nuevaFila][nuevaColumna]) {
                            Palabra nuevaPalabra = new Palabra(sb.toString() + Global.getMatriz().getMatrizAdyacencia()[nuevaFila][nuevaColumna].getLetra());
                            PalabraConPosicion nuevaPalabraConPosicion = new PalabraConPosicion(nuevaPalabra, nuevaFila, nuevaColumna);
                            NodoBFS nuevoNodo = new NodoBFS(nuevaPalabraConPosicion);
                            try {
                                nodoActual.addHijo(nuevoNodo);
                                NodoCola nuevoNodoCola = new NodoCola(nuevoNodo);
                                cola.encolar(nuevoNodoCola);
                                visitados[nuevaFila][nuevaColumna] = true;
                            } catch (IllegalStateException e) {
                                // Manejar el caso de que se alcance el máximo de hijos permitidos
                                // Podrías registrar un mensaje de error o implementar una lógica alternativa
                            }
                        }
                    }
                }
            }
        }
    }

    return null;
}

}

