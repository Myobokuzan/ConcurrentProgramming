/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Parcial2017;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 *
 * @author Tomas
 */
public class TramoCompartido {
    private boolean viaLibre;
    
    private Lock llave;
    private int esperaT1;
    private int esperaT2;
    private Condition colaTramo1;
    private Condition colaTramo2;
    
    TramoCompartido(){
        this.viaLibre=true;
        this.llave=new ReentrantLock(true);
        this.esperaT1=0;
        this.esperaT2=0;
        this.colaTramo1=llave.newCondition();
        this.colaTramo2=llave.newCondition();
    }
    
    public void entrar(int tramo){
        llave.lock();
        while(!this.viaLibre){
            try{
                if(tramo==1){
                    this.esperaT1++;
                    this.colaTramo1.await();
                    System.out.println(tramo+" se puso en espera");
                }else{
                    this.esperaT2++;
                    this.colaTramo2.await();
                    System.out.println(tramo+" se puso en espera");
                }
            }catch(InterruptedException e){}    
        }
        this.viaLibre=false;
        System.out.println("Un tren del tramo "+tramo+" ha entrado a la via compartida.");
        llave.unlock();
    }
    
    public void salir(int tramo){
        llave.lock();
        this.viaLibre=true;
        if(tramo==1&&this.esperaT2>0||tramo==2&&this.esperaT1<=0){
            this.esperaT1--;
            this.colaTramo2.signal();
        }else{
            if(tramo==2&&this.esperaT1>0||tramo==1&&this.esperaT2<=0){
                this.esperaT2--;
                this.colaTramo1.signal();
            }
            
        }
        System.out.println("El tren del tramo "+tramo+" ha salido de la via comapartida.");
        this.llave.unlock();
    }
}
