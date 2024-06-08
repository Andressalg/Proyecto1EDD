/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package proyecto1.Listas;

import proyecto1.Grafos.Vertice;

/**
 *
 * @author Buste
 * @param <T>
 */
public class Lista <T> {
    
    private int first;
    private int last;
    
    private int size;
    private Nodo[] array;

    public Lista(int max) {
        this.first = -1;
        this.last = -1;
        this.size = 0;
        this.array = new Nodo[max];
    }

    public Lista() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    /**
 *
 * @author Buste
 * borra todos los elementos de la lista
 */
    public void empty() {
        setFirst (first = -1);
        setLast (last = -1);
        setSize (size = 0);
        setArray(new Nodo[getArray().length]);
        
    }
    /**
 *
 * @author Buste
 * @return True si la lista no tiene ningun elemento
 */
    public boolean isEmpty() {
        
        return getSize()==0;
    }
    
    /**
 *
 * @author Buste
 * @return True si la lista no tiene ningun elemento vacio
 */
    public boolean isFull(){
        
        return getSize()>= getArray().length;
    }
    
    /**
 *
 * @author Buste
 * @return el numero en la lista el cual no tiene ningun elemento
 */
    public int searchEmptySlot(){
     for (int i = 0; i < getArray().length; i++) {
         if(getArray()[i] == null) {
             return i;
         }
     }
     return -1;
     
    }

    /**
 *
 * @author Buste
 * introduce el parametro al principio de la lista
 */
    public void addAtStart(T data) {
      if(!isFull() ){
        Nodo newNodo = new Nodo(data);
        if(isEmpty()) {
            getArray()[0]=newNodo;
            setFirst(0);
        }else{
            int i = searchEmptySlot();
            newNodo.setNext(getFirst());
            getArray()[i] = newNodo;
            setFirst(i);
            
            
        }
       
        setSize(getSize()+1);
        
        }
        
    }
    /**
 *
 * @author Buste
 * introduce el parametro al final de la lista
 */
    public void addAtEnd(T data){
        
        if(!isFull()){
            Nodo newNodo = new Nodo(data);
            if(isEmpty()) {
                getArray()[0]= newNodo;
                setFirst(0);
                setLast(0);
                
                
            }else{
                int i =searchEmptySlot();
                getArray()[getLast()].setNext(i);
                getArray()[i]=newNodo;
                setLast(i);
            }
            
            setSize(getSize()+1);
        }
    }
    /**
 *
 * @author Buste
 * agrega valores int empezando de 0, terminando en el parametro
 */
    public void insertOrderedNumbered(T data) {
                if(!isFull()){
            Nodo newNodo = new Nodo(data);
            if(isEmpty()) {
                getArray()[0]= newNodo;
                setFirst(0);
                setLast(0);
            }else if (Integer.parseInt(String.valueOf(getArray()[getFirst()]))>= Integer.parseInt(String.valueOf((data)))){
                addAtStart(data);
            }else if (Integer.parseInt(String.valueOf(getArray()[getLast()]))<= Integer.parseInt(String.valueOf((data)))){
                addAtEnd(data);
            }else{
                int previous = getFirst();
                int current = getFirst();
                while(Integer.parseInt(String.valueOf(getArray()[current]))<= Integer.parseInt(String.valueOf((data)))){
                    previous = current;
                    current = getArray()[current].getNext();
                }
                int i = searchEmptySlot();
                newNodo.setNext(getArray()[previous].getNext());
                getArray()[i]=newNodo;
                getArray()[previous].setNext(i);
            }   
            
            setSize(getSize()+1);
        }
                
    }
    
    /**
     *
     * @return todos los valores en cada lista
     */
    public String print(){
       String print = "";
       
       int aux = getFirst();
       
       while (aux!=-1){
           print += getArray()[aux].getData() + "\n";
           
           aux = getArray()[aux].getNext();
       }
       return print;
}
   
    
    /**
     * @return the first
     */
    public int getFirst() {
        return first;
    }

    /**
     * @param first the first to set
     */
    public void setFirst(int first) {
        this.first = first;
    }

    /**
     * @return the last
     */
    public int getLast() {
        return last;
    }

    /**
     * @param last the last to set
     */
    public void setLast(int last) {
        this.last = last;
    }

    /**
     * @return the size
     */
    public int getSize() {
        return size;
    }

    /**
     * @param size the size to set
     */
    public void setSize(int size) {
        this.size = size;
    }

    /**
     * @return the array
     */
    public Nodo[] getArray() {
        return array;
    }

    /**
     * @param array the array to set
     */
    public void setArray(Nodo[] array) {
        this.array = array;
    }

    public void AddAtStart(Vertice newVertice) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}

