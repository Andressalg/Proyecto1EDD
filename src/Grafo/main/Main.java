/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Grafo.main;

import Grafo.Grafico.MostrarGrafo;
import Grafo.Interfaz.InterfazPrincipal;

/**
 * Esta es la clase principal que ejecuta la aplicación.
 */
public class Main {

    /**
     * El método principal que se ejecuta al iniciar la aplicación.
     *
     * @param args los argumentos de la línea de comandos
     */
    public static void main(String[] args) {
        // Crea un nuevo objeto MostrarGrafo
        MostrarGrafo x = new MostrarGrafo();
        
        // Crea un nuevo objeto InterfazPrincipal y lo hace visible
        InterfazPrincipal objeto = new InterfazPrincipal();
        objeto.setVisible(true);
    }
    
}

