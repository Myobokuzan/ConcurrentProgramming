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
public class Ejercicio3 {
    public static void main(String []args){
        Reloj reloj=new Reloj();
        Thread c1=new Thread(new ControladorReloj(reloj));
        Thread t1=new Thread(new Trabajador(reloj,3));
        Thread t2=new Thread(new Trabajador(reloj,4));
        Thread t3=new Thread(new Trabajador(reloj,5));
        Thread t4=new Thread(new Trabajador(reloj,6));
        Thread t5=new Thread(new Trabajador(reloj,7));
        
        c1.start();
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
