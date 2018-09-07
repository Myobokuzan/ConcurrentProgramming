/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TP_2_Bis;

import java.util.concurrent.Semaphore;

/**
 *
 * @author Tomas
 */
public class Letra2 extends Thread{
    private Semaphore c;
    private Semaphore c2;
    public Letra2(Semaphore c,Semaphore c2){
        this.c=c;
        this.c2=c2;
    }
    public void run(){
        try{
            c.acquire();
            System.out.println("B");
            System.out.println("B");
            c.release();
            c2.release();
        }catch(Exception e){}
    }
}
