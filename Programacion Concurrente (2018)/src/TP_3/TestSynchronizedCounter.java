/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TP_3;

/**
 *
 * @author Tomas
 */
public class TestSynchronizedCounter {
    public static void main(String[]args){
        SynchronizedObjectCounter counter=new SynchronizedObjectCounter();
        Thread h1=new Thread("h1"){
            public void run(){
                counter.increment();
                System.out.println(Thread.currentThread().getName()+" "+counter.value());
            }
        };
        
        Thread h2=new Thread("h2"){
            public void run(){
                counter.decrement();
                System.out.println(Thread.currentThread().getName()+" "+counter.value());
            }
        };
        h1.start();
        h2.start();
    }
}
