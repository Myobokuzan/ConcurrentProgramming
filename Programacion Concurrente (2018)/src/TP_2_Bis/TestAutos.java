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
public class TestAutos {
    public static void main(String[]args){
        Reserva r=new Reserva();
        Auto a1=new Auto("a2",5,r);
        Auto a2=new Auto("y8",5,r);
        Auto a3=new Auto("j7",5,r);
        Auto a4=new Auto("w0",5,r);
        Auto a5=new Auto("u5",5,r);
        Thread t1=new Thread(a1,"Auto 1");
        Thread t2=new Thread(a2,"Auto 2");
        Thread t3=new Thread(a3,"Auto 3");
        Thread t4=new Thread(a4,"Auto 4");
        Thread t5=new Thread(a5,"Auto 5");
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
                
    }
}
