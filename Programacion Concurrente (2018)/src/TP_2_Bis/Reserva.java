/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TP_2_Bis;

import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author tomas.quinonez
 */
public class Reserva {
    Semaphore mutex=new Semaphore(1,true);
    public void cargar(){
        //System.out.println("El auto "+Thread.currentThread().getName()+" llego a la estacion.");
        try {
            mutex.acquire();
        } catch (InterruptedException ex) {}
        
        System.out.println("Cargando "+Thread.currentThread().getName());
        try {
            Thread.sleep(5000);
            System.out.println(Thread.currentThread().getName()+" cargado.");
        } catch (InterruptedException ex) {}
        mutex.release();
    }
}
