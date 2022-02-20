/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Producto;

/**
 *
 * @author nostromo
 */
public class Producto {

    private String nombre;
    private int cantidad;

    public Producto(String nombre, int cantidad) {
        this.nombre = nombre;
        this.cantidad = cantidad;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public void setCantidad(int cantidad){
        this.cantidad = cantidad;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public int getCantidad(){
        return cantidad;
    }
}
