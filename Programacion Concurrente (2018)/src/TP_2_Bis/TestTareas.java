/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TP_2_Bis;

/**
 *
 * @author Tomas
 */
public class TestTareas {
    public static void main(String[]args) throws InterruptedException{
        Recurso r=new Recurso(3);
        
        Tarea1 t1=new Tarea1(r);
        Tarea2 t2=new Tarea2(r);
        t2.start();
        //t2.join();
        t1.start();
    }
}
