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
public class SynchronizedCounter {
    private int c = 1;
    public synchronized void increment() {c=c+3;}
    public synchronized void decrement() {c--;}
    public synchronized int value() {return c;}
}
