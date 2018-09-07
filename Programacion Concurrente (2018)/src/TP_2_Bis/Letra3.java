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
public class Letra3 extends Thread{
    private Semaphore c;
    public Letra3(Semaphore c){
        this.c=c;
    }
    public void run(){
        try{
            c.acquire();
            System.out.println("C");
            System.out.println("C");
            System.out.println("C");
            c.release();
        }catch(Exception e){}
    }
}
