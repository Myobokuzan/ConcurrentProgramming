/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BarberoDormilon;

/**
 *
 * @author Tomas
 */
public class TestBarberia {
    public static void main(String[]args){
        Thread[] array=new Thread[10];
        Barberia barb=new Barberia(5);
        Barbero barbero=new Barbero(barb);
        for(int i=0;i<array.length;i++){
            array[i]=new Thread(new Cliente(barb));
        }
        
        Thread t1=new Thread(barbero);
        t1.start();
        for(int j=0;j<array.length;j++){
            array[j].start();
        }
    }
}
