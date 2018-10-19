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
public class Ejercicio1 {
    public static void main(String [] args){
        TramoCompartido viaCompartida=new TramoCompartido();
        Tren tren1=new Tren(2,viaCompartida);
        Tren tren2=new Tren(1,viaCompartida);
        Tren tren3=new Tren(2,viaCompartida);
        Tren tren4=new Tren(2,viaCompartida);
        Tren tren5=new Tren(2,viaCompartida);
        Tren tren6=new Tren(1,viaCompartida);
        
        Thread t1=new Thread(tren1);
        Thread t2=new Thread(tren2);
        Thread t3=new Thread(tren3);
        Thread t4=new Thread(tren4);
        Thread t5=new Thread(tren5);
        Thread t6=new Thread(tren6);
        
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
    }
}
