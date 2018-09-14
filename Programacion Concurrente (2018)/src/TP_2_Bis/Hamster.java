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
public class Hamster extends Thread{
    private Jaula jaula;
    public Hamster(Jaula j){
        this.jaula=j;     
    }
    public void run(){
        this.jaula.comer();
        this.jaula.correr();
        this.jaula.descansar();
    }
    
}
