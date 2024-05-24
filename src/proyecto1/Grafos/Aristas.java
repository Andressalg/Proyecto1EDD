/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto1.Grafos;

/**
 *
 * @author Buste
 */
class Arista {
   private Vertice inicio;
   private Vertice fin;
   private int peso;
   
   public Arista(Vertice InicioA, Vertice FinV, int peso){
       this.inicio = InicioA;
       this.fin = FinV;
       this.peso = peso;
   }
   
   public Vertice getInicio() {
       return this.inicio;
   }
   
   public Vertice getFinal(){
       return this.fin;
   }
   
   public int getPeso(){
       return this.peso;
   }
   
   
}