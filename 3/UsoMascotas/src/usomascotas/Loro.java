/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package usomascotas;

/**
 *
 * @author nostromo
 */
public class Loro extends Aves{
    private String origen;
    private boolean habla;
    
    public Loro(String nombre, int edad, String estado, String fechaNacimiento, String origen, boolean habla, String pico, boolean vuela){
        super(nombre, edad, estado, fechaNacimiento, pico, vuela);
    }
    
    @Override
    public void volar(){
        System.out.println("El loro vuela mucho y rápido");
    }
    
    @Override
    public void habla(){
        System.out.println("Pio Pio yo hablar, soy Loro!");
    }
    
        @Override
    public void muestra(){
        System.out.println(super.getNombre());
    }

}
