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
public class MainThread {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Cliente 1", new int[] { 2,20, 2,35, 1,15, 5,80, 2,41, 3,25 });
        Cliente cliente2 = new Cliente("Cliente 2", new int[] { 1,50, 3,45, 5,41, 1,46, 1,10 });
        long initialTime = System.currentTimeMillis();
        Cajera cajera1=new Cajera("Cajera1",cliente1,initialTime);
        Cajera cajera2=new Cajera("Cajera2",cliente2,initialTime);
        cajera1.start();
        cajera2.start();
    }
}
