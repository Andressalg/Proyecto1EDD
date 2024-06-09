/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import proyecto1.Grafos.Vertice;

/**Crea la matriz
 *
 * @author salom
 */
public class Matriz {
    private Vertice[][] MatrizAdyacencia;
    private static final int Num_filas = 4;
    private static final int Num_columnas = 4;

    public Matriz() {
        this.MatrizAdyacencia = new Vertice[Num_filas][Num_columnas];
    }
    
    
    /**
     * Agrega un vértice (letra) al tablero en la posición especificada.
     * @param fila La fila del vértice.
     * @param columna La columna del vértice.
     * @param letra La letra del vértice.
     */
    public void AddVertice(int fila, int columna, String letra){
        Vertice nuevoVertice = new Vertice(letra);
        MatrizAdyacencia[fila][columna] = nuevoVertice;
        
        // Agregar aristas a los vértices adyacentes
        if (fila > 0) {
            MatrizAdyacencia[fila - 1][columna].addArista(nuevoVertice);
            nuevoVertice.addArista(MatrizAdyacencia[fila - 1][columna]);
        }
        if (fila < Num_filas - 1) {
            MatrizAdyacencia[fila + 1][columna].addArista(nuevoVertice);
            nuevoVertice.addArista(MatrizAdyacencia[fila + 1][columna]);
        }
        if (columna > 0) {
            MatrizAdyacencia[fila][columna - 1].addArista(nuevoVertice);
            nuevoVertice.addArista(MatrizAdyacencia[fila][columna - 1]);
        }
        if (columna < Num_columnas - 1) {
            MatrizAdyacencia[fila][columna + 1].addArista(nuevoVertice);
            nuevoVertice.addArista(MatrizAdyacencia[fila][columna + 1]);
        }
    }

    public Vertice[][] getMatrizAdyacencia() {
        return MatrizAdyacencia;
    }

    public void setMatrizAdyacencia(Vertice[][] MatrizAdyacencia) {
        this.MatrizAdyacencia = MatrizAdyacencia;
    }
    
    public int getNumFilas(){
        return Num_filas;
    }
    
    public int getNumColumnas(){
        return Num_columnas;
    }
    
}
