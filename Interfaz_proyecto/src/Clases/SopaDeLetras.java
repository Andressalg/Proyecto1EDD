/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;
import proyecto1.Listas.ListaSimplementeEnlazada;
        
/**
 *
 * @author salom
 */
public class SopaDeLetras {
    private ListaSimplementeEnlazada<String> diccionario;
    private ListaSimplementeEnlazada<ListaSimplementeEnlazada<Character>> tablero;

    public SopaDeLetras(ListaSimplementeEnlazada<String> diccionario, 
            ListaSimplementeEnlazada<ListaSimplementeEnlazada<Character>> tablero) {
        this.diccionario = diccionario;
        this.tablero = tablero;
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

    public ListaSimplementeEnlazada<ListaSimplementeEnlazada<Character>> getTablero() {
        return tablero;
    }

    public void setTablero(ListaSimplementeEnlazada<ListaSimplementeEnlazada<Character>> tablero) {
        this.tablero = tablero;
    }
    
    /**
     * Metodo para generar el tablero de la sopa de letras a partir de la informacion
     * propocionada, 
     */
    public void generarTablero(){
        int filas = 4;
        int columnas = 4;
        
        // Iterar sobre las filas del tablero
        for (int i = 0; i < filas; i++ ){
            // Se crea una nueva lista para representar una fila del tablero.
            ListaSimplementeEnlazada<Character> fila = new ListaSimplementeEnlazada<> (columnas);
            
            //Itera sobre las columnas de la fila actual.
            for(int j = 0; j < columnas; j++){
                //Obtiene la letra en la posicion (i,j) del tablero
                char letra = tablero.get(i).get(j);
                //Agregar la letra a la fila actual
                fila.addAtEnd(letra);
            }
            //Agreagr la fila completa al tablero
            tablero.addAtEnd(fila);
        }
    }

}

