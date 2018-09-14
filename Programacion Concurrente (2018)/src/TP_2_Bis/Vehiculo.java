/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TP_2_Bis;

/**
 *
 * @author tomas.quinonez
 */
public class Vehiculo {
    private String patente;
    protected int kmParaEstacion;
    protected Reserva r;
    public Vehiculo(String pat,int km,Reserva r){
        this.patente=pat;
        this.kmParaEstacion=km;
        this.r=r;
    }
    public int getKmEstacion(){
        return this.kmParaEstacion;
    }
}
