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
public class Reloj {
    private int hora;
    
    Reloj(){
        this.hora=1;
    }
    
    public synchronized void aumentarHora(){
        this.hora++;
        System.out.println("Se ha aumentado la hora. Hora actual: "+this.hora);
        this.notify();
    }
    
    public synchronized void trabajar(int horaDespertar){
        while(horaDespertar!=this.hora){
            try{this.wait();}catch(InterruptedException e){}
            this.notify();
        }
    }
}
