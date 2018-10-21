/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BarberoDormilon;

/**
 *
 * @author Tomas
 */
public class Cliente extends Thread{
    private Barberia laBarberia;
    
    Cliente(Barberia unaBarb){
        this.laBarberia=unaBarb;
    }
    
    public void run(){
        if(this.laBarberia.entrarBarberia()){
            this.laBarberia.solicitarCorte();
            this.laBarberia.salir();
            System.out.println("Se ha ido un cliente");
        }else{
            System.out.println("Se ha ido un cliente porque no hay lugar");
        }
    }
}
