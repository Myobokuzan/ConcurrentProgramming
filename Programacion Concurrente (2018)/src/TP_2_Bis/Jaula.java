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
public class Jaula {
    private Semaphore mutex=new Semaphore(1,true);
    private Semaphore mutex2=new Semaphore(1,true);
    private Semaphore mutex3=new Semaphore(1,true);
    Jaula(){
    }
    void comer(){
        try{
            mutex.acquire();
        }catch(Exception e){}
        System.out.println("El hamster "+Thread.currentThread().getName()+" está comiendo del plato.");
        try{Thread.sleep(7000);}catch(Exception e){};
        System.out.println(Thread.currentThread().getName()+" ha terminado de comer del plato.\n");
        mutex.release();
    }
    void correr(){
        try{mutex2.acquire();}catch(Exception e){}
        System.out.println("El hamster "+Thread.currentThread().getName()+" está corriendo en la rueda.");
        try{Thread.sleep(10000);}catch(Exception e){}
        System.out.println(Thread.currentThread().getName()+" ha terminado de correr en la rueda.\n");
        mutex2.release();
    }
    void descansar(){
        try{mutex3.acquire();}catch(Exception e){}
        System.out.println("El hamster "+Thread.currentThread().getName()+" está descansando en la hamaca.");
        try{Thread.sleep(15000);}catch(Exception e){}
        System.out.println(Thread.currentThread().getName()+" ha terminado de descansar en la hamaca.\n");
        mutex3.release();
    }
}
