/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Parcial2017;

/**
 *
 * @author Tomas
 */
public class Auto implements Runnable{
    private Espacio espacio;
    
    Auto(Espacio esp){
        this.espacio=esp;
    }
    
    public void run(){
        this.espacio.subir();
        this.espacio.bajar();
    }
}
