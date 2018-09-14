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
public class TestJaula {
    public static void main(String[]args){
        Jaula j=new Jaula();
        Hamster h1=new Hamster(j);
        Hamster h2=new Hamster(j);
        Hamster h3=new Hamster(j);
        Hamster h4=new Hamster(j);
        Hamster h5=new Hamster(j);
        h1.setName("Hamster 1");
        h2.setName("Hamster 2");
        h3.setName("Hamster 3");
        h4.setName("Hamster 4");
        h5.setName("Hamster 5");
        h1.start();
        h2.start();
        h3.start();
        //h4.start();
        //h5.start();
    }
}
