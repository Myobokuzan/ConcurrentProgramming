/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TP_1;
import java.util.Scanner;
/**
 *
 * @author Tomas
 */
public class ej_8 {
    public static void edadPersona() throws EdadException{
        System.out.println("Ingrese edad");
        Scanner sc = new Scanner(System.in);
        int i=sc.nextInt();
        if(i<18){
            throw new EdadException();
        }
    }
    public static void numRuleta() throws RuletaException{
        System.out.println("Ingrese un numero del 1 al 50");
        Scanner sc = new Scanner(System.in);
        int i=sc.nextInt();
        int numero =(int) ((Math.random() * i) + 1);
        if(numero!=i){
            throw new RuletaException();
        }
    }
    public static void coleccion() throws ArrayIndexOutOfBoundsException{
        Object[] arr=new Object[10];
        Scanner sc = new Scanner(System.in);
        for(int i=1;i<=5;i++){
            int valor=sc.nextInt();
            arr[i]=valor;
        }
        for(int k=1;k<=7;k++){
            if(arr[k]==null){
                throw new ArrayIndexOutOfBoundsException("ERROR");
            }
            System.out.println(arr[k]);
        }
    }
    public static void cargaDatos(){
        boolean continuar=true;
        Scanner sc = new Scanner(System.in);
        while(continuar){
            try{
                System.out.println("Ingrese valor distinto de 0");
                int valor=sc.nextInt();
                if(valor==0){
                    throw new RuntimeException("Valor ingresado es 0");
                }
            }catch(RuntimeException e){
                System.out.println(e.getMessage());
            }
            System.out.println("Continuar?");
            continuar=sc.nextBoolean();
        }
    }
    public static void main(String[]args){
        cargaDatos();
    }
}
