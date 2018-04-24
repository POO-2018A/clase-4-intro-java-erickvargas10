/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

  import java.util.Scanner;
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
  System.out.println("verificación de número par o impar:");
int numero=0;
    System.out.println("ingrese número :");
   numero = scan.nextInt();
     if(numero%2==0){
     System.out.println(numero +" es par");
     }else{
          System.out.println(numero +" es impar");
     }
  }
    }
    
