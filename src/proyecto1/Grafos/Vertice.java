/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto1.Grafos;
import java.util.ArrayList;
/**
 *
 * @author Buste
 */
public class Vertice {
    private String data;
    private ArrayList<Arista> aristas;
   
    public Vertice(String data){
        this.data = data;
        this.aristas = new ArrayList<Arista>();
    }
    
    public void addArista (Vertice vertice){
        this.aristas.add(new Arista(this, vertice));
    }
}
