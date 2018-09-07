/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TP_2_Bis;

import java.util.concurrent.Semaphore;

/**
 *
 * @author Tomas
 */
public class TestLetras {
    public static void main(String[]t){
        Semaphore sem1=new Semaphore(0,true);
        Semaphore sem2=new Semaphore(0,true);
        Letra1 l1=new Letra1(sem1);
        Letra2 l2=new Letra2(sem1,sem2);
        Letra3 l3=new Letra3(sem2);
        l1.start();
        l2.start();
        l3.start();
    }
}
