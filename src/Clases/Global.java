/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.io.File;
import proyecto1.Listas.ListaSimplementeEnlazada;
import proyecto1.Listas.ListaSimplementeEnlazada;

/**
 * Clase para cambiar o guardar valores que seran usados en el programa
 * @author salom
 */
public class Global {
    private static File file;
    private static Matriz matriz;
    private static ListaSimplementeEnlazada ListaPalabras;

    public static File getFile() {
        return file;
    }

    public static void setFile(File file) {
        Global.file = file;
    }

    public static Matriz getMatriz() {
        return matriz;
    }

    public static void setMatriz(Matriz matriz) {
        Global.matriz = matriz;
    }

    public static ListaSimplementeEnlazada getListaPalabras() {
        return ListaPalabras;
    }

    public static void setListaPalabras(ListaSimplementeEnlazada ListaPalabras) {
        Global.ListaPalabras = ListaPalabras;
    }

}
