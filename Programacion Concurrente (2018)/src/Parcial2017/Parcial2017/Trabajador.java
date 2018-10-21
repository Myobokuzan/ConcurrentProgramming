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
public class Trabajador extends Thread{
    private Reloj elReloj;
    private int miHora;
    
    Trabajador(Reloj unReloj,int hora){
        this.elReloj=unReloj;
        this.miHora=hora;
    }
    
    public void run(){
        while(true){
            this.elReloj.trabajar(miHora);
            System.out.println("Trabajador "+this.miHora+" está trabajando");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException ex) {}
            System.out.println("Trabajador "+this.miHora+" terminó de trabajar");
        }
    }
}
