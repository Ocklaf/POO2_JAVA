/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package usomascotas;


import java.util.ArrayList;

/**
 *
 * @author nostromo
 */
public class Inventario {
    private static ArrayList <Mascota> inventario = new ArrayList();
    
    public void almacenarDatosAnimal(Mascota m){
        this.inventario.add(m);
    }
    
    public void muestraAnimales(){
        String tipo;
        
        for(int i = 0; i<inventario.size(); i++){
            if(inventario.get(i) instanceof Perro)
                tipo = "Perro";
            if(inventario.get(i) instanceof Gato)
                tipo = "Gato";
            if(inventario.get(i) instanceof Loro)
                tipo = "Loro";
            if(inventario.get(i) instanceof Canario)
                tipo = "Canario";
            else
                tipo= "Desconocido - ERROR";
            System.out.println("Animal " + (i+1) + ": Tipo: " + tipo + " - Nombre: " + inventario.get(i).getNombre());
        }
    }
    
    public void muestraDatosAnimal(Mascota m){
        m.muestra();
    }
    
    public void muestraTodosLosDatos(){
        for(int i= 0; i<inventario.size();i++){
            inventario.get(i).muestra();
        }
    }
    
    public boolean eliminaAnimal(Mascota m){
        return inventario.remove(m);
    }
    
}
