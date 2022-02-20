/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Producto;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author nostromo
 */
public class UsoProducto {
    public static void main(String[] args){
        Producto p1 = new Producto("Teclado", 3);
        Producto p2 = new Producto("Alfombrilla", 10);
        Producto p3 = new Producto("Monitor", 2);
        Producto p4 = new Producto("Altavoces", 7);
        Producto p5 = new Producto("SSD", 1);
        
        ArrayList lista = new ArrayList();
        
        lista.add(p1);
        lista.add(p2);
        lista.add(p3);
        lista.add(p4);
        lista.add(p5);
        
        for(Iterator it = lista.iterator(); it.hasNext();){
            Producto p = (Producto)it.next();
            System.out.println(p.getNombre() + ", tiene: " + p.getCantidad() + " unidades");
        }
        
        lista.remove(2);
        lista.remove(3);
        
        Producto p6 = new Producto("Memoria RAM", 2);
        
        lista.add(3, p6);
        
        for(Iterator it = lista.iterator(); it.hasNext();){
            Producto p = (Producto)it.next();
            System.out.println(p.getNombre() + ", tiene: " + p.getCantidad() + " unidades");
        }
        
        lista.clear();
        
        System.out.println(lista.size());
    }
}
