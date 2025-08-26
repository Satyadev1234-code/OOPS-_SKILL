//java program using For Loop
package CSE;

import java.util.Scanner;

public class FOR_LOOP {
 public static void main(String[] args){
  int n;
  Scanner sc= new Scanner(System.in);
  n=sc.nextInt();
  for(int i=1;i<=n;i++) {
   System.out.println("Count: "+i);
  }
 }
}