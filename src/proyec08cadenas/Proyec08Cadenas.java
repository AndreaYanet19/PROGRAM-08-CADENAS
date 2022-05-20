/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyec08cadenas;

/**
 *
 * @author andys
 */
public class Proyec08Cadenas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String nombre = "Andrea";
        System.out.println(nombre);

        String letra = String.valueOf(nombre.charAt(0));
        System.out.println(letra);
        letra = letra.toUpperCase();
        System.out.println(letra);

        String posicion2 = String.valueOf(nombre.charAt(2));
        System.out.println(posicion2);
        posicion2 = posicion2.toUpperCase();
        posicion2 = posicion2.toLowerCase();
        
        System.out.println(nombre + " " + letra + " " + posicion2);
        String cadena = posicion2 + letra;
    }
    
}
