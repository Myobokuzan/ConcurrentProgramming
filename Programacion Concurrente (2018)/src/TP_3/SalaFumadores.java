/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TP_3;

import java.util.concurrent.Semaphore;

/**
 *
 * @author Tomas
 */
public class SalaFumadores {
    int[] mesa=new int[3];
    int cant=0;
    Semaphore mutex=new Semaphore(0,false);
    public void colocar(int ing){
        if(cant<=1){
            mesa[cant]=ing;
            cant++;
            if(cant==2){
                if(mesa[0]==mesa[1]){
                    cant=1;
                }else{
                    System.out.println("En mesa: "+(mesa[0])+", "+(mesa[1]));
                    mutex.release();
                }
            }
        }
    }
    public void entrafumar(int id){
        try{mutex.acquire();}catch(Exception e){}
        try{
            if(id==mesa[0]||id==mesa[1]){
                mutex.release();
                throw new RuntimeException();
            }
        }catch(RuntimeException e){}
    }
    public void terminafumar(){
        cant=0;
    }
}
