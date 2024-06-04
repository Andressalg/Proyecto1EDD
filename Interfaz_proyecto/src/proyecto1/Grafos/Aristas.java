/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto1.Grafos;

/**
 *
 * @author Buste
 */
public class Arista {
   private Vertice inicio;
   private Vertice fin;
   private int peso;
   
   public Arista(Vertice InicioA, Vertice FinV, int peso){
       this.inicio = InicioA;
       this.fin = FinV;
       this.peso = peso;
   }
      /**
 *
 * @author Buste
 * The Inicio
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