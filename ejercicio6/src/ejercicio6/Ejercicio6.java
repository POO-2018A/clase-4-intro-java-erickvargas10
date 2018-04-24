/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6;

import java.util.Scanner;
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
  double fahrenheit=1;
  double celsius;
  
  System.out.println("convertidor de grados fahrenheit a grados celcius");
    System.out.println("ingrese los grados fahrenheit en un rango de 0 a 100");
   fahrenheit = scan.nextDouble();
    System.out.println("ingrese los grados fahrenheit en un rango de 0 a 100");
 System.out.println("los grados fahrenheit son  "+fahrenheit+ " transformado a celsius es :");
   celsius=(((fahrenheit-32)*5)/9);
   System.out.println(celsius+"grados");
  }
}
    
    

