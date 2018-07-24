package Samples;
import java.util.Scanner;

public class Factorial {
  public static void main(String[] args) {
	  int a,sum=1;
	  System.out.print("Enter the factorial number:");
	  Scanner fact = new Scanner(System.in);
	  a = fact.nextInt();
	  for (int i=1; i<=a; i++) {
		  sum =sum * i;  
	  }
	  System.out.print("Factorial is "+sum);
	  fact.close();
  }
}
