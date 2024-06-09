/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto1.Listas;

import Clases.PalabraConPosicion;

/**
 *
 * @author salom
 */
public class NodoBFS {
    private PalabraConPosicion palabraConPosicion;
    private NodoBFS[] hijos;
    private int numHijos;
    private static final int MAX_HIJOS = 8; // Máximo de 8 hijos teniendo en cuenta las 8 celdas adyacentes

    public NodoBFS(PalabraConPosicion palabraConPosicion) {
        this.palabraConPosicion = palabraConPosicion;
        this.hijos = new NodoBFS[MAX_HIJOS];
        this.numHijos = 0;
    }

    public PalabraConPosicion getPalabraConPosicion() {
        return palabraConPosicion;
    }

    public NodoBFS[] getHijos() {
        return hijos;
    }

    public int getNumHijos() {
        return numHijos;
    }

    public void addHijo(NodoBFS hijo) {
        if (numHijos < MAX_HIJOS) {
            hijos[numHijos++] = hijo;
        } else {
            // se maneja el caso de que se alcance el máximo de hijos permitidos
            throw new IllegalStateException("Se ha alcanzado el máximo de hijos permitidos.");
        }
    }
}


