/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package usomascotas;


/**
 *
 * @author nostromo
 */
public class Perro extends Mascota {
    private String raza;
    private boolean pulgas;
    
    public Perro(String nombre, int edad, String estado, String fechaNacimiento, String raza, boolean pulgas){
        super(nombre, edad, estado, fechaNacimiento);
        
        this.raza = raza;
        this.pulgas = pulgas;
    }
    
    public String getRaza(){
        return raza;
    }
    
    public boolean getPulgas(){
        return pulgas;
    }
    
    public void setRaza(String raza){
        this.raza = raza;
    }
    
    public void setPulgas(boolean pulgas){
        this.pulgas = pulgas;
    }
    
    @Override
    public void muestra(){
        System.out.println("Nombre: " + super.getNombre());
        System.out.println("Edad: " + super.getEdad());
        System.out.println("Estado: " + super.getEstado());
        System.out.println("Fecha de nacimiento: " + super.getFechaNacimiento());
        System.out.println("Raza: " + this.raza);
        System.out.println("Tiene pulgas: " + this.pulgas);
    }
    
    @Override
    public void habla(){
        System.out.println("Guau Guau");
    }
}
