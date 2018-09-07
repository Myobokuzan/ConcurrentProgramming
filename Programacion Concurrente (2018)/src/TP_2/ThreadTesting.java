/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TP_2;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Tomas
 */
public class ThreadTesting{
    public static void main (String[] args){
        /*Thread miHilo= new MiEjecucion();
        miHilo.start();
        try {
            miHilo.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(ThreadTesting.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("En el main");*/
        
        PingPong t1 =new PingPong("PING",10);
        PingPong t2= new PingPong("PONG",5);
        // Activación
        //t1.start();
        //t2.start();
        PingPong t3= new PingPong("PANG",22);
        PingPong t4= new PingPong("PUNG",33);
        //t3.start();
        //t4.start();
        /*for(int i=1;i<10000;i++){

            System.out.println("HOLIWIS");
            try{
                Thread.sleep(1);
            }
            catch(InterruptedException e){};*/
        //}
        // Espera unos segundos
        long a=System.currentTimeMillis();
        try{ Thread.sleep(5000);
        }catch (InterruptedException e){};
        System.out.println((System.currentTimeMillis()-a)/1000);
        
        //System.out.println("khé");
 // Finaliza la ejecución de los threads

    }

}
