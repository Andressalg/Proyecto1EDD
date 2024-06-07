/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**Crea la matriz
 *
 * @author salom
 */
public class Matriz {
    private int maximo;
    private char matrix[][];
    private char letras[];
    private int value;

    /**
     * Inicializa el tamano maximo del tablero, crea la matriz y establece el 
     * valor de value en 0
     * @param maximo 
     */
    public Matriz(int maximo) {
        this.maximo = maximo;
        this.matrix = new char[maximo][maximo];
        this.letras = new char[maximo * maximo];
        this.value = 0;
    }

    public int getMaximo() {
        return maximo;
    }

    public void setMaximo(int maximo) {
        this.maximo = maximo;
    }

    public char[][] getMatrix() {
        return matrix;
    }

    public void setMatrix(int fila, int columna, char valor) {
        this.matrix[fila][columna] = valor;
        this.letras[value++] = valor;
    }

    public char[] getLetras() {
        return letras;
    }

    public void setLetras(char[] letras) {
        this.letras = letras;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
  
    
    /**
     * Imprime el tablero por consola.
     */
    public void imprimirTablero() {
        for (int i = 0; i < this.maximo; i++) {
            for (int j = 0; j < this.maximo; j++) {
                System.out.print(this.matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    
}
