/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Parcial2017;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Tomas
 */
public class Transbordador implements Runnable{
    private Espacio espacio;
    
    Transbordador(Espacio esp){
        this.espacio=esp;
    }
    
    public void run(){
        while(true){
            this.ir();
            this.volver();
        }
    }
    
    public void ir(){
        this.espacio.esperarAutos();
        try {
            System.out.println("Ha partido el barco");
            Thread.sleep(5000);
        } catch (InterruptedException ex) {}
        this.espacio.notificarLlegada();
    }
    
    public void volver(){
        this.espacio.esperarDescargaAutos();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException ex) {}
        this.espacio.notificarVuelta();
    }
}
