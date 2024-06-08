/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto1.Grafos;

/**
 *
 * @author Buste
 */
public class Aristas {

    static Object getLast() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
   private Vertice inicio;
   private Vertice fin;
   private int peso;
   
   public Aristas (Vertice InicioA, Vertice FinV, int peso){
       this.inicio = InicioA;
       this.fin = FinV;
       this.peso = peso;
   }
      /**
 *
 * @author Buste
 * The Inicio
     * @return 
 */
   public Vertice getInicio() {
       return this.inicio;
   }
      /**
 *
 * @author Buste
 * The Fin
 */
   public Vertice getFinal(){
       return this.fin;
   }
      /**
 *
 * @author Buste
 * The Peso
 */
   public int getPeso(){
       return this.peso;
   }
   
   
    
}
