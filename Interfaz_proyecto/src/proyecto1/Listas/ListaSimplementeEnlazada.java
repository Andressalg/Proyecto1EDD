
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package proyecto1.Listas;

import Clases.Palabra;

public class ListaSimplementeEnlazada{
    private NodoDiccionario first;
    private int size;

    public ListaSimplementeEnlazada() {
        this.first = null;
        this.size = 0;
    }

    public NodoDiccionario getFirst() {
        return first;
    }

    public void setFirst(NodoDiccionario first) {
        this.first = first;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    
    public boolean isEmpty(){
        return getFirst() == null;
    }
    
    public void addAtStart(Palabra data){
        NodoDiccionario nodo = new NodoDiccionario(data);
        nodo.setNext(first);
        first = nodo;
        size++;
    }
    
    public void AddAtEnd(Palabra data){
        NodoDiccionario nodo = new NodoDiccionario(data);
        if (isEmpty()){
            setFirst(nodo);
        }else{
            NodoDiccionario current = getFirst();
            while(current.getNext() != null){
                current = current.getNext();
            }
            current.setNext(nodo);
        }
        size++;
    }
    
    public boolean PalabraEnDiccionario(String palabra){
        NodoDiccionario current = getFirst();
        while(current != null){
            if(current.getData().equals(palabra)){
                return true;
            }
            current = current.getNext();
        }
        return false;
    }
}