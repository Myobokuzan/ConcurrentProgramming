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
class RuletaException extends Exception {
    public RuletaException(){
        super("\033[31mNo es el numero elegido en la ruleta");
    }

}
