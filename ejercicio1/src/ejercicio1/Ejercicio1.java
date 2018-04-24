/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;
  import java.util.Scanner;
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    boolean nevando=false;
    boolean lloviendo=true;
    double temperatura;
    System.out.println("verificacion de salir de casa");
        System.out.println("ingrese la temperatura ");
    temperatura = scan.nextDouble();
    if(temperatura<=10){
         if(nevando){
             System.out.println("NO SALIR DE CASA"); 
    }
    }else{
    if(lloviendo){
    System.out.println("puede salir de casa"); 
    }
    }
    }
    }
   
