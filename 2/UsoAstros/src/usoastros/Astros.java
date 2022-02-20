/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package usoastros;

/**
 *
 * @author nostromo
 */
public abstract class Astros {
    
    private String nombre;
    private double radioEcuatorial;
    private double periodoRotacion;
    private double masa;
    private double temperaturaMedia;
    private double gravedad;
    
    public Astros(String nombre, double radioEcuatorial, double periodoRotacion, double masa, double temperaturaMedia, double gravedad){
        this.nombre = nombre;
        this.radioEcuatorial = radioEcuatorial;
        this.periodoRotacion = periodoRotacion;
        this.masa = masa;
        this.temperaturaMedia = temperaturaMedia;
        this.gravedad = gravedad;
    }
    
    public double getRadio(){
        return radioEcuatorial;
    }
    
    public double getPeriodo(){
        return periodoRotacion;
    }
    
    public double getMasa(){
        return masa;
    }
    
    public double getTemperatura(){
        return temperaturaMedia;
    }
    
    public double getGravedad(){
        return gravedad;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setRadio(double radioEcuatorial){
        this.radioEcuatorial = radioEcuatorial;
    }
    
    public void setPeriodo(double periodoRotacion){
        this.periodoRotacion = periodoRotacion;
    }
    
    public void setMasa(double masa){
        this.masa = masa;
    }
    
    public void setTemperatura(double temperatura){
        temperaturaMedia = temperatura;
    }
    
    public void setGravedad(double gravedad){
        this.gravedad = gravedad;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    /*MÉTODO ABSTRACTO DE LA CLASE ABSTRACTA*/
    public abstract void muestra();
}

