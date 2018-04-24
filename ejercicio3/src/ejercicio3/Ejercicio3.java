/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;
  import java.util.Scanner;
/**
 *
 * @author ESFOT
 */
public class Ejercicio3 {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner scan=new Scanner(System.in);
     int edad=1;
    System.out.println("ingrese su edad :");
    edad= scan.nextInt();
     System.out.println(edad+" años de edad");
     if(edad>=18){
     System.out.println("usted es mayor de edad");
     }else{
     System.out.println("usted es menor de edad");
     }
  }
}
  
