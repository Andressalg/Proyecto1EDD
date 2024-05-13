/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto1.Listas.Grafos;

/**
 *
 * @author Buste
 */
public class Grafo {
    int [][] matriz;
    
    Grafo(int size){
        matriz = new int [size][size];
    }
    
    public void addArista (Aristas aristas) {
       
    }
    
    public void addVertice (int source, int distancia){
        matriz[source][distancia] = 1;
    }
    
    public boolean checkVertice(int source, int distancia){
        if(matriz[source][distancia] == 1) {
            return true;
        }else{
            return false;
        }
        
    public void print(){
        for(int i = 0; i < matriz.length; i++) {
            for(int j=0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j]+ " ");
             
            }
            System.out.println();
        }
    }
    }
    
    
    
}