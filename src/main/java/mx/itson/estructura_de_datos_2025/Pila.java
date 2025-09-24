/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.estructura_de_datos_2025;

import java.util.Stack;

/**
 *
 * @author ABCDE-SONY
 */
public class Pila {
    public  static void main(String[] args){
        Stack pila = new Stack();
        Stack colores = new Stack <String> ();
        
        colores.push("ROJO");
        colores.push("VERDE");
        colores.push("AZUL");
        colores.push("AMARRILLO");
        colores.push("MAGENTA");
        colores.push("CIAN");
        colores.push("BLANCO");
        colores.push("NEGRO");
        
        System.out.println("colores");
        
        //consultar los siguientes elementos
        System.out.println("siguiente: "+colores.peek());
        //sacar siguiente elemento de la pila
        System.out.println("Eliminado: "+colores.pop());
        System.out.println("Eliminado: "+colores.pop());
        
        //vaciar pila
        colores.clear();
        System.out.println(colores);
        if(colores.isEmpty()){
            System.out.println("pila vacia");
            
        }else{
            System.out.println("la pila tiene elementos");
        }
    }
    
    
    
    
    
    
    
    
    
}
