/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BarberoDormilon;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Tomas
 */
public class Barbero extends Thread{
    private Barberia laBarberia;
    
    Barbero(Barberia unaBarb){
        this.laBarberia=unaBarb;
    }
    
    public void run(){
        while(true){
            this.laBarberia.esperarCliente();
            System.out.println("Se ha empezado un corte");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException ex) {}
            System.out.println("Se termino de cortar");
            this.laBarberia.terminarCorte();
        }
    }
}
