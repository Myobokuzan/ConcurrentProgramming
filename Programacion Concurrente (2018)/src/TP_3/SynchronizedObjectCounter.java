/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TP_3;

/**
 *
 * @author Tomas
 */
public class SynchronizedObjectCounter {
    private int c = 0;
    public void increment(){
        synchronized (this) {
            c++;
        }
    }
    public void decrement() {
        synchronized (this) {
        c--;
        }
    }
    public int value() {return c;}
}
