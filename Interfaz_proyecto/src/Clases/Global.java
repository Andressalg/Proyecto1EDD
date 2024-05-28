/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.io.File;

/**
 * Clase para cambiar o guardar valores que seran usados en el programa
 * @author salom
 */
public class Global {
    private static File file;

    public static File getFile() {
        return file;
    }

    public static void setFile(File file) {
        Global.file = file;
    }
    
}
