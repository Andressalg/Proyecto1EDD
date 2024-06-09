/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto1.Listas;

import Clases.Palabra;

/**
 *
 * @author Buste
 */
public class NodoDiccionario{
    
    NodoDiccionario next;
    private Palabra data;

    public NodoDiccionario(Palabra data) {
        this.next = null;
        this.data = data;
    }

    public NodoDiccionario(int fila, int columna, String valueOf) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    /**
     * @return the next
     */
    public NodoDiccionario getNext() {
        return next;
    }

    public void setNext(NodoDiccionario next) {
        this.next = next;
    }

    public Palabra getData() {
        return data;
    }

    public void setData(Palabra data) {
        this.data = data;
    }
    
}

