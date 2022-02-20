/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package usomascotas;

/**
 *
 * @author nostromo
 */
public abstract class Mascota extends Inventario{
    private String nombre;
    private int edad;
    private String estado;
    private String fechaNacimiento;
    
    public Mascota (String nombre, int edad, String estado, String fechaNacimiento){
        this.nombre = nombre;
        this.edad = edad;
        this.estado = estado;
        this.fechaNacimiento = fechaNacimiento;    
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public int getEdad(){
        return edad;
    }
    
    public String getEstado(){
        return estado;
    }
    
    public String getFechaNacimiento(){
        return fechaNacimiento;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public void setEdad(int edad){
        this.edad = edad;
    }
    
    public void setEstado(String estado){
        this.estado = estado;
    }
    
    public void setFechaNacimiento(String fechaNacimiento){
        this.fechaNacimiento = fechaNacimiento;
    }
    
    public abstract void muestra();
    
    public abstract void habla();
}