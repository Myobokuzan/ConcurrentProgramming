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
public class Recurso {
    private int r;
    Recurso(int r){
        this.r=r;
    }
    synchronized void setRecurso(int r){
        this.r=r;
    }
    synchronized int getRecurso(){
        return this.r;
    }
}
