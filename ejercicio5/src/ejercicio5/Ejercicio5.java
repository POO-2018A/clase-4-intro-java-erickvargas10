/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5;
import java.util.Scanner;
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner scan=new Scanner(System.in);
  int numero=1;
  System.out.println("Numero del mes");
    System.out.println("si desea salir del programas presiona el numero 13");
    do{
    System.out.println("ingrese el numero delmes que desea saber:");
   numero = scan.nextInt();
 
    switch(numero){
    case 1:
      System.out.println("su mes es ENERO");   
         break;
       case 2:
      System.out.println("su mes es FEBRERO");
      break;
       case 3:
      System.out.println("su mes es MARZO");
      break;
       case 4:
      System.out.println("su mes es ABRIL");
      break;
       case 5:
      System.out.println("su mes es MAYO");
      break;
       case 6:
      System.out.println("su mes es JUNIO");
      break;
       case 7:
      System.out.println("su mes es JULIO");
      break;
       case 8:
      System.out.println("su mes es AGOSTO");
      break;
       case 9:
      System.out.println("su mes es SEPTIEMBRE");
      break;
       case 10:
      System.out.println("su mes es OCTUBRE");
      break;
       case 11:
      System.out.println("su mes es NOVIEMBRE");
      break;
       case 12:
      System.out.println("su mes es DICIEMBRE");
      break;
       case 13:
      System.out.println("gracias por ingresar Adios");
       default:
      System.out.println("el numero ingresado esta fuera del rango vuelva a ingresar");
      break;
   }
   }while(numero!=13);
    
  }
}
    
    
