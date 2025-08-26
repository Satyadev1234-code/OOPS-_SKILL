package CSE;

import java.util.Scanner;

public class Temperature {
 public static void main(String[]args) {
  float Ftemp,Ctemp;
  Scanner sc= new Scanner(System.in);
  System.out.println("Enter the temp: ");
  Ftemp=sc.nextInt();
  Ctemp=(Ftemp - 32)*5/9;
  System.out.println(Ctemp + "is celsius temperature");
  
  
 }

}