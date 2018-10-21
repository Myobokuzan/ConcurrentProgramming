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
public class ControladorReloj extends Thread{
    private Reloj elReloj;
    
    ControladorReloj(Reloj unReloj){
        this.elReloj=unReloj;
    }
    
    public void run(){
        while(true){
            this.elReloj.aumentarHora();
            try {
                Thread.sleep(7000);
            } catch (InterruptedException ex) {}
        }
    }
}
