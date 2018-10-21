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
public class EspacioConLocks {
    int cantAutos;
    boolean finViaje;
    boolean enPuertoEste;
    private Lock llave;
    private Condition barcoEnEspera;
    private Condition autosParaSubir;
    private Condition autosParaBajar;
    
    EspacioConLocks(){
        this.cantAutos=0;
        this.finViaje=false;
        this.enPuertoEste=true;
        this.llave=new ReentrantLock();
        this.barcoEnEspera=llave.newCondition();
        this.autosParaSubir=llave.newCondition();
        this.autosParaBajar=llave.newCondition();
    }
    
    public void  subir(){
        this.llave.lock();
        while(this.cantAutos==10||!this.enPuertoEste){
            try{this.autosParaSubir.await();}catch(InterruptedException e){}
        }
        this.cantAutos++;
        System.out.println("Se ha subido un auto");
        this.autosParaSubir.signal();
        this.barcoEnEspera.signal();
        this.llave.unlock();
    }
    
    public void bajar(){
        this.llave.lock();
        while(!this.finViaje){
            try{this.autosParaBajar.await();}catch(InterruptedException e){}
        }
        this.cantAutos--;
        System.out.println("Se ha bajado un auto");
        this.autosParaBajar.signal();
        this.barcoEnEspera.signal();
        this.llave.unlock();
    }
    
    public void esperarDescargaAutos(){
        this.llave.lock();
        while(this.cantAutos>0){
            try{this.barcoEnEspera.await();}catch(InterruptedException e){}
        }
        this.finViaje=false;
        System.out.println("Se han bajado todos los autos.");
        this.llave.unlock();
    }
    
    public void esperarAutos(){
        this.llave.lock();
        while(this.cantAutos<10){
            System.out.println("Se bloquea el barco");
            try{this.barcoEnEspera.await();}catch(InterruptedException e){}
        }
        this.enPuertoEste=false;
        this.llave.unlock();
    }
    
    public void notificarLlegada(){
        this.llave.lock();
        this.finViaje=true;
        System.out.println("EL BARCO HA LLEGADO AL DESTINO");
        this.autosParaBajar.signal();
        this.llave.unlock();
    }
    
    public void notificarVuelta(){
        this.llave.lock();
        this.enPuertoEste=true;
        System.out.println("EL BARCO HA REGRESADO AL PUERTO ESTE");
        this.autosParaSubir.signal();
        this.llave.unlock();
    }
}
