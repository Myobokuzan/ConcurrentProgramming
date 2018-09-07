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
        Cliente cliente1 = new Cliente("Cliente 1", new int[] { 2, 2, 1, 5, 2, 3 });
        Cliente cliente2 = new Cliente("Cliente 2", new int[] { 1, 3, 5, 1, 1 });
        long initialTime = System.currentTimeMillis();
        Cajera cajera1=new Cajera("Cajera1",cliente1,initialTime);
        Cajera cajera2=new Cajera("Cajera2",cliente2,initialTime);
        cajera1.start();
        cajera2.start();
    }
}
