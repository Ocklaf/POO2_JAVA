/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package usoastros;

import java.util.ArrayList;
//import java.util.Iterator;
import java.util.Scanner;

public class UsoAstros {

    static Scanner in = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ArrayList<Astros> misAstros = new ArrayList();

        Planeta Tierra = new Planeta("Tierra", 5.97E24, 12742.0, 1.0, 365.25, 14.05, 9.78, 146600000.0);
        Planeta Venus = new Planeta("Venus", 4.869E24, 12103.6, 243.02, 584.0, 463.85, 8.87, 108200000.0);
        Planeta Marte = new Planeta("Marte", 6.42E23, 6794.4, 24.62, 686.97, -46.0, 3.711, 227940000.0);

        // Instanciamos satélites
        Satelite Luna = new Satelite("Luna", 7.349E22, 3474.0, 27.5, 27.5, -153.0, 1.62, 384400.0, Tierra);
        Satelite Fobos = new Satelite("Fobos", 1.072E16, 11000.0, 0.0, 0.319, -40.15, 0.0084, 6000, Marte);
        Satelite Deimos = new Satelite("Deimos", 2.244E15, 12400.0, 0.0, 1.262, -40.15, 0.0039, 23460, Marte);

        misAstros.add(Tierra);
        misAstros.add(Luna);
        misAstros.add(Marte);
        misAstros.add(Venus);
        misAstros.add(Fobos);
        misAstros.add(Deimos);
//        
//        ArrayList<Satelite> laLuna = new ArrayList<Satelite>();
//        laLuna.add(Luna);
//        
//        Tierra.setTieneSatelites(true);
//        
//        Tierra.setSatelites(laLuna);
//        

//        Tierra.setTieneSatelites(true);
//        Tierra.setSatelites(Luna);
//        Tierra.muestra();
//        //Luna.muestra();
//        
//        Marte.setTieneSatelites(true);
//        Marte.setSatelites(Fobos);
//        Marte.setSatelites(Deimos);
//        
//        Marte.muestra();
//        
//        Astros a = misAstros.get(0);
//        System.out.println(a.getNombre());
        mostrarMenu(misAstros);
    }

    public static void mostrarMenu(ArrayList<Astros> misAstros) {
        int opcion;

        do {
            for (int i = 0; i < misAstros.size(); i++) { //.size() devuelve el tamaño (longitud) del ArrayList
                System.out.println(i + ": " + misAstros.get(i).getNombre());
            }
            System.out.println("Elige uno de los Astros que quieras visualizar (-1 pra salir)");
            opcion = in.nextInt();
            if(opcion != -1 && opcion < misAstros.size())
                mostrarDatos(opcion, misAstros);
        } while (opcion != -1);
    }
    
    public static void mostrarDatos(int opcion, ArrayList<Astros> misAstros){
        misAstros.get(opcion).muestra();
    }
}
