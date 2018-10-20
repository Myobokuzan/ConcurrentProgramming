
package Parcial2017;

import java.util.concurrent.Semaphore;


/**
 *
 * @author Tomas
 */
public class TramoCompartido {
    private Semaphore sem1;
    private Semaphore sem2;
    private Semaphore mutex;
    //private Semaphore mutex2;
    private int cantT1;
    private int cantT2;
    private boolean primero; //Variable que controla la entrada del primer tren de una tanda
    
    TramoCompartido(){
        this.sem1=new Semaphore(0,true);
        this.sem2=new Semaphore(0,true);
        this.mutex=new Semaphore(1,true);
        //this.mutex2=new Semaphore(1,true);
        this.cantT1=0;
        this.cantT2=0;
        this.primero=true;
    }
    
    /*public int getCantT1(){
        int cant;
        try{this.mutex2.acquire();}catch(InterruptedException e){}
        cant=this.cantT1;
        this.mutex2.release();
        return cant;
    }*/
    
    public void entrarTramo1(){
        try{this.mutex.acquire();}catch(InterruptedException e){}
        if(this.primero){
            this.primero=false;
            this.sem1.release();
        }else{
            this.cantT1++;
        }
        this.mutex.release();
        try{this.sem1.acquire();}catch(InterruptedException e){}
        System.out.println("Tren del tramo 1 ha entrado a la via compartida.");
    }
    
    public void salirTramo1(){
        try{this.mutex.acquire();}catch(InterruptedException e){}
        System.out.println("Tren del tramo 1 se ha ido");
        if(this.cantT2>0){
            this.cantT2--;
            this.sem2.release();
        }else{
            if(this.cantT1>0){
                this.cantT1--;
                this.sem1.release();
            }else{
                this.primero=true;
            }
        }
        this.mutex.release();
    }
    
    public void entrarTramo2(){
        try{this.mutex.acquire();}catch(InterruptedException e){}
        if(this.primero){
            this.primero=false;
            this.sem2.release();
        }else{
            this.cantT2++;
        }
        this.mutex.release();
        try{this.sem2.acquire();}catch(InterruptedException e){}
        System.out.println("Tren del tramo 2 ha entrado a la via compartida.");
    }
    
    public void salirTramo2(){
        try{this.mutex.acquire();}catch(InterruptedException e){}
        System.out.println("Tren del tramo 2 se ha ido");
        if(this.cantT1>0){
            this.cantT1--;
            this.sem1.release();
        }else{
            if(this.cantT2>0){
                this.cantT2--;
                this.sem2.release();
            }else{
                this.primero=true;
            }
        }
        this.mutex.release();
    }
}
