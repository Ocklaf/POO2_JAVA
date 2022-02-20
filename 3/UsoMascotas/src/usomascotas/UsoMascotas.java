/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package usomascotas;

import java.util.ArrayList;

/**
 *
 * @author nostromo
 */
public class UsoMascotas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //ArrayList<Mascota> inventario = new ArrayList();
        
        Inventario in = new Inventario();
        
        Perro Noble = new Perro("Noble", 11, "Durmiendo", "09/04/2010", "Mestizo YorkShire", false);
        Perro Runa = new Perro("Runa", 6, "Gordita", "13/09/2016", "Meztiza Pastora Alemana", false);
        
        Noble.almacenarDatosAnimal(Noble);
        Runa.almacenarDatosAnimal(Runa);
        
        in.muestraAnimales();
        
        in.muestraTodosLosDatos();
        
        in.muestraDatosAnimal(Noble);
     
        //System.out.println(in.eliminaAnimal(Runa));
        
        in.muestraAnimales();
    }
    
}
