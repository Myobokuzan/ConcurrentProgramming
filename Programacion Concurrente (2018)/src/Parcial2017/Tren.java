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
public class Tren implements Runnable{
    private int tramo;
    private TramoCompartido via;
    
    Tren(int tramo,TramoCompartido recurso){
        this.tramo=tramo;
        this.via=recurso;
    }
    
    public void run(){
        this.via.entrar(this.tramo);
        try{Thread.sleep(2000);}catch(InterruptedException e){}
        this.via.salir(this.tramo);{}
    }
}
