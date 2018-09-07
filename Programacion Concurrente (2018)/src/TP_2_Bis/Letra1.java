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
public class Letra1 extends Thread{
    private Semaphore s;
    public Letra1(Semaphore c){
        this.s=c;
    }
    public void run(){
            System.out.println("A");
            s.release();
    }
}
