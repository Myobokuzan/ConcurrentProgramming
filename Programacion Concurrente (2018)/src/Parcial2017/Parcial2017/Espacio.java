/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Parcial2017;

/**
 *
 * @author Tomas
 */
public class Espacio {
    int cantAutos;
    boolean finViaje;
    boolean enPuertoEste;
    Espacio(){
        this.cantAutos=0;
        this.finViaje=false;
        this.enPuertoEste=true;
    }
    
    public synchronized void  subir(){
        while(this.cantAutos==10||!this.enPuertoEste){
            try{this.wait();}catch(InterruptedException e){}
        }
        this.cantAutos++;
        System.out.println("Se ha subido un auto");
        this.notify();
    }
    
    public synchronized void bajar(){
        while(!this.finViaje){
            try{this.wait();}catch(InterruptedException e){}
        }
        this.cantAutos--;
        System.out.println("Se ha bajado un auto");
        this.notify();
    }
    
    public synchronized void esperarDescargaAutos(){
        while(this.cantAutos>0){
            try{this.wait();}catch(InterruptedException e){}
        }
        this.finViaje=false;
        System.out.println("Se han bajado todos los autos.");
    }
    
    public synchronized void esperarAutos(){
        while(this.cantAutos<10){
            System.out.println("se bloquea el barco");
            try{this.wait();}catch(InterruptedException e){}
        }
        this.enPuertoEste=false;
    }
    
    public synchronized void notificarLlegada(){
        this.finViaje=true;
        System.out.println("EL BARCO HA LLEGADO AL DESTINO");
        this.notify();
    }
    
    public synchronized void notificarVuelta(){
        this.enPuertoEste=true;
        System.out.println("EL BARCO HA REGRESADO AL PUERTO ESTE");
        this.notify();
    }
}
