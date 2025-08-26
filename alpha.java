package CSE;

import java.util.Scanner;

public class alpha {
 public static void main(String[]args) {
  char Alpha;
  Scanner sc= new Scanner(System.in);
  Alpha=sc.next().charAt(0);
  if((Alpha>= 'A' && Alpha >='Z' || Alpha >='a' && Alpha >'z')) {
   System.out.println(Alpha +" is not an alpha");
  }
  else {
   System.out.println(Alpha +" is an alpha");
  
 }
 }
}