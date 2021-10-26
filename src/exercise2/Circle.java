package exercise2;

import java.util.Scanner;

public class Circle {
  
   public static void main(String[] args){
     Scanner input = new Scanner(System.in);
      
      double r = input.nextDouble();
      double C = 2 * r * Math.PI;
      double A = r * r * Math.PI;
      
      System.out.println("Circumference: " + C );
      System.out.println("Area: " + A); 
      
  }
}