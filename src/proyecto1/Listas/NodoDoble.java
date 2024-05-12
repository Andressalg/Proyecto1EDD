/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto1.Listas;

/**
 *
 * @author Buste
 * @param <T>
 */
public class NodoDoble<T> extends Nodo<T>{
    protected NodoDoble prev;
    
    public NodoDoble(){
        super();
        prev = null;
    }

    public NodoDoble(T valor) {
        super(valor);
        prev = null;
    }
    
    public NodoDoble<T> setPrev (NodoDoble<T> newPrev) {
        NodoDoble<T> output = prev;
        prev=newPrev;
        return output;
        
    }
    
    public NodoDoble<T> getPrev() {
        return prev;
        
        
    }
    
    public boolean add (T valor){
        if(super.add(valor)){
            ( (NodoDoble<T>) next).setPrev(this);
            return true;
            
        }else{
            return false;
        }
}
    
public boolean addBefore (T valor) {
    return prev.add(valor);
}
}