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
public class Cajera extends Thread{
    private String nombre;
    private Cliente cliente;
    private long initialTime;
    private int total;
    private int dineroComedor;
    
    public Cajera(String nombre,Cliente cliente,long initialTime){
        this.nombre=nombre;
        this.cliente=cliente;
        this.initialTime=initialTime;
        this.total=0;
        this.dineroComedor=0;
    }
    public void run() {
        System.out.println("La cajera " + this.nombre +" COMIENZA A PROCESAR LA COMPRA DEL CLIENTE "+ this.cliente.getNombre() + " EN EL TIEMPO: "+ (System.currentTimeMillis() - this.initialTime) / 1000 + "seg");
        for (int i = 0; i < this.cliente.getCarroCompra().length; i=i+2) {
            this.esperarXsegundos(cliente.getCarroCompra()[i]);
            total=total+this.cliente.getCarroCompra()[i+1];
            System.out.println("Procesado el producto " + (i + 1) + " del cliente " +this.cliente.getNombre() + "->Tiempo: " +(System.currentTimeMillis() - this.initialTime) / 1000 +"seg");
            System.out.println("Subtotal "+this.cliente.getNombre()+": $"+this.total);
        }
        System.out.println("La cajera" + this.nombre + " HA TERMINADO DE PROCESAR "+ this.cliente.getNombre() + " EN EL TIEMPO: " +(System.currentTimeMillis() - this.initialTime) / 1000 +"seg");
        System.out.println("Total a pagar del cliente "+this.cliente.getNombre()+" $"+this.total);
        System.out.println("Total a pagar + 1% del cliente "+this.cliente.getNombre()+": $"+(this.total*101)/100);
    }
    public void esperarXsegundos(int i){
        long tiempo=i*1000;
        try{
            Thread.sleep(tiempo);
        }catch(InterruptedException e){};
    }
}
