/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BarberoDormilon;

import java.util.concurrent.Semaphore;

/**
 *
 * @author Tomas
 */
public class Barberia {
    private int sillasOcupadas;
    private int sillasMax;
    private Semaphore mutex;
    private Semaphore sillon;
    private Semaphore barbero;
    private Semaphore corteTerminado;
    
    Barberia(int cantSillas){
        this.sillasOcupadas=0;
        this.sillasMax=cantSillas;
        this.mutex=new Semaphore(1,true);
        this.sillon=new Semaphore(1,true);
        this.barbero=new Semaphore(0,true);
        this.corteTerminado=new Semaphore(0,true);
    }
    
    public boolean entrarBarberia(){
        try{this.mutex.acquire();}catch(InterruptedException e){}
        boolean hayLugar=false;
        if(this.sillasOcupadas<this.sillasMax){
            this.sillasOcupadas++;
            System.out.println("Se ha sentado un cliente en las sillas de espera. Sillas ocupadas: "+this.sillasOcupadas);
            hayLugar=true;
        }
        mutex.release();
        return hayLugar;
    }
    
    public void solicitarCorte(){
        try{this.sillon.acquire();}catch(InterruptedException e){}
        try{this.mutex.acquire();}catch(InterruptedException e){}
        this.sillasOcupadas--;
        System.out.println("Se sento un cliente en el SILLON. Sillas ocupadas: "+this.sillasOcupadas);
        this.mutex.release();
        this.barbero.release();
        try{this.corteTerminado.acquire();}catch(InterruptedException e){}
    }
    
    public void esperarCliente(){
        try{this.barbero.acquire();}catch(InterruptedException e){}
    }
    
    public void terminarCorte(){
        this.corteTerminado.release();
    }
    
    public void salir(){
        this.sillon.release();
    }
}
