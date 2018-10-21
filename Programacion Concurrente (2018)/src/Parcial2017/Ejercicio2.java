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
public class Ejercicio2 {
    public static void main(String[]args){
        Espacio esp=new Espacio();
        Transbordador t=new Transbordador(esp);
        Auto[] colAutos=new Auto[50];
        for(int i=0;i<colAutos.length;i++){
            colAutos[i]=new Auto(esp);
        }
        Thread[] colHilos=new Thread[50];
        for(int j=0;j<colHilos.length;j++){
            colHilos[j]=new Thread(colAutos[j]);
        }
        Thread t1=new Thread(t);
        t1.start();
        for(int k=0;k<50;k++){
            colHilos[k].start();
        }
        
    }
}
