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
public class Tarea2 extends Thread{
    private Recurso r;
    Tarea2(Recurso r){
        this.r=r;
    }
    public void run(){
        this.r.multPorDos();
    }
}
