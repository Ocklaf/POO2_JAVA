/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package usoastros;

import java.util.ArrayList;
import java.util.Iterator;

public class Planeta extends Astros {

    private double distanciaSol;
    private double orbitaSol;
    private boolean tieneSatelites = false;
    private ArrayList<Satelite> satelites;
    
    
    //Constructor con lista de satélites
    public Planeta(String nombre, double distanciaSol, double orbitaSol, double radioEcuatorial, double periodoRotacion, double masa, double temperaturaMedia, double gravedad, boolean tieneSatelites, ArrayList<Satelite> satelites) {
        super(nombre, radioEcuatorial, periodoRotacion, masa, temperaturaMedia, gravedad);
        this.tieneSatelites = tieneSatelites;
        this.distanciaSol = distanciaSol;
        this.orbitaSol = orbitaSol;
        this.satelites = satelites;
    }
    
        public Planeta(String nombre, double distanciaSol, double orbitaSol, double radioEcuatorial, double periodoRotacion, double masa, double temperaturaMedia, double gravedad) {
        super(nombre, radioEcuatorial, periodoRotacion, masa, temperaturaMedia, gravedad);

        this.distanciaSol = distanciaSol;
        this.orbitaSol = orbitaSol;
        this.satelites = new ArrayList();
    }

    @Override
    public void muestra() {
        System.out.println("");
        System.out.println("Nombre del planeta: " + super.getNombre());
        System.out.println("Distancia al sol: " + this.distanciaSol + " km");
        System.out.println("Orbita al sol: " + this.orbitaSol + " días");
        System.out.println("Tiene satélites el planeta: " + this.tieneSatelites);
        System.out.println("Radio ecuatorial: " + super.getRadio() + " km");
        System.out.println("Período de rotación: " + super.getPeriodo() + " horas");
        System.out.println("Masa del planeta: " + super.getMasa() + " Gigatoneladas");
        System.out.println("Temperatura media del planeta: " + super.getTemperatura() + " Grados Celsius");
        System.out.println("Gravedad: " + super.getGravedad() + " m/s");
        if (tieneSatelites) {
            for(Iterator<Satelite> it = this.satelites.iterator(); it.hasNext();){
                it.next().muestra();
            }
        }
    }

    public void setTieneSatelites(boolean tieneSatelites) {
        this.tieneSatelites = tieneSatelites;
    }
    
    public void setSatelites(Satelite s){
        satelites.add(s);
//        for(Iterator<Satelite> it = satelites.iterator(); it.hasNext();){
//            this.satelites.add(it.next());
//        }
    }
}
