/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package usomascotas;

/**
 *
 * @author nostromo
 */
public class Gato extends Mascota{
    private String color;
    private boolean peloLargo;
    
    public Gato(String nombre, int edad, String estado, String fechaNacimiento, String color, boolean peloLargo){
        super(nombre, edad, estado, fechaNacimiento);
        
        this.color = color;
        this.peloLargo = peloLargo;
    }
    
    public void muestra(){
        System.out.println(this.color);
    }
    
    public void habla(){
        System.out.println("Miau Miau");
    }

}
