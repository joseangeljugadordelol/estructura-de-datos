/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mx.itson.estructura_de_datos_2025;

import java.util.ArrayList;

/**
 *
 * @author ABCDE-SONY
 */
public class ArrayList2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String> listaPokemons = new ArrayList<String>();
        
        // .add es para agregar ala lista
        listaPokemons.add("Picachu");
        listaPokemons.add("Charmander");
        listaPokemons.add("Squirtle");
        listaPokemons.add("Pichu");
        listaPokemons.add("Chicorita");
        listaPokemons.add("Miau");
        System.out.println(listaPokemons);
        
        // .get consultar una posicion
        
        System.out.println(listaPokemons.get(4));
        
        // remove elimina con el valor o con la lista por su indice o valor
        listaPokemons.remove(2);
        listaPokemons.remove("Miau");
        System.out.println(listaPokemons);
        
        //.set edutar valor
        listaPokemons.set(2,"Super pichu");
        
        //.add tambien funciona para insertar un valor en una posicion
        listaPokemons.add(3, "snorglax");
        
        System.out.println(listaPokemons);
        // mostrar la cantidad que contiene la lista
        System.out.println(listaPokemons.size());
        // iterrar con for
        for(int i=0; i<listaPokemons.size();i++){
            System.out.println("pokemon "+i+": "+ listaPokemons.get(i));
            
            
            
        }
        for(String pokemon: listaPokemons){
            System.out.println(pokemon);
        }
        
        
        
        
    }
    
}
