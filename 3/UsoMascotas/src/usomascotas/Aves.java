/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package usomascotas;

/**
 *
 * @author nostromo
 */
public abstract class Aves extends Mascota{
    private String pico;
    private boolean vuela;
    
    public Aves(String nombre, int edad, String estado, String fechaNacimiento, String pico, boolean vuela){
        super(nombre, edad, estado, fechaNacimiento);
        
        this.pico = pico;
        this.vuela = vuela;
    }
    
    public abstract void volar();
    //public abstract void habla();
}
