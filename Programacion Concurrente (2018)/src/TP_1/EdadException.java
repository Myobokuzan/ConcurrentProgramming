/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TP_1;

/**
 *
 * @author Tomas
 */
public class EdadException extends RuntimeException{
    public EdadException(){
        super("\033[31mLa persona es menor de edad.");
    }
    public EdadException(String error){
        super("\033[31m"+error);
    }
}
