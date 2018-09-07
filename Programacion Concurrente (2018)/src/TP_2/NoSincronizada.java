/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TP_2;

/**
 *
 * @author Tomas
 */
public class NoSincronizada extends Thread{
    static int n = 1;
    public void run() {
    for (int i = 0; i < 10; i++) {
    System.out.println(n);
    n++;
    }
}
public static void main(String args[]) {
    Thread thr1 = new NoSincronizada();
    Thread thr2 = new NoSincronizada();
    thr1.start();
    thr2.start();
}
}
