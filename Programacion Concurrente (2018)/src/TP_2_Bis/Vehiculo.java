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
    private String modelo;
    private String marca;
    protected int kmParaEstacion;
    public Vehiculo(String pat,String mod,String marca,int km){
        this.patente=pat;
        this.modelo=mod;
        this.marca=marca;
        this.kmParaEstacion=km;
    }
    public int getKmEstacion(){
        return this.kmParaEstacion;
    }
}
