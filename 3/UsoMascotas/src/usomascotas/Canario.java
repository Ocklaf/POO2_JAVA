/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package usomascotas;

/**
 *
 * @author nostromo
 */
public class Canario extends Aves{
    public Canario(String nombre, int edad, String estado, String fechaNacimiento, String origen, boolean habla, String pico, boolean vuela){
        super(nombre, edad, estado, fechaNacimiento, pico, vuela);
    }
    
    @Override
    public void volar(){
        System.out.println("El canario es más de vuelos cortos y de menor altura");
    }
    
    @Override
    public void habla(){
        System.out.println("Pio Pio yo canto, que soy un Canario!");
    }
    
    @Override
    public void muestra(){
        System.out.println(super.getNombre());
    }
}
