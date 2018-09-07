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
public class Contador {
    private int cont;
    Contador(){
        this.cont=1;
    }
    synchronized int getContador(){
        return this.cont;
    }
    synchronized void setContador(int i){
        this.cont=i;
    }
}
