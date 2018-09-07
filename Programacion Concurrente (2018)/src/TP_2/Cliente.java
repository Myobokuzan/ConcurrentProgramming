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
public class Cliente{
    private String nombre;
    private int[] carro;
    private int TAM=20;
    
    public Cliente(String nombre,int[] carroCompra){
        this.nombre=nombre;
        this.carro=carroCompra;
    }
    public int[] getCarroCompra(){
        return this.carro;
    }
    public String getNombre(){
        return this.nombre;
    }
}
