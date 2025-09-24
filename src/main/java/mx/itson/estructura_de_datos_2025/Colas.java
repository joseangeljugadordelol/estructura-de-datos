/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.estructura_de_datos_2025;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author ABCDE-SONY
 */
public class Colas {
    public static void main(String[] args){
        
        Queue <String> colaOxxo = new LinkedList <>();
        
        colaOxxo.add("Juanita");
        colaOxxo.add("Robertito");
        colaOxxo.add("{Francisca");
        colaOxxo.add("Josefina");
        colaOxxo.add("Maria del carmen");
        colaOxxo.add("El greñas");
        
        
        // imprime todo pero feo y repite el primer strim
        System.out.println("Atendiendo a: "+colaOxxo.peek());
        System.out.println(colaOxxo);
        
        System.out.println("");
        // imprime todo feo pero no repite el primer strim
        System.out.println("Atendiendo a: "+colaOxxo.poll());
        System.out.println(colaOxxo);
        
        // while repite todo de forma organizada
        while(!colaOxxo.isEmpty()){
            System.out.println("**Despachando a: "+colaOxxo.poll());
                 
        }
    }
}
