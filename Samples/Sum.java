package Samples;
import java.util.Scanner;

public class Sum {
	 void Sum (int a, int b) {
		 int c = a + b;
		 System.out.println("The sum of "+a+ " and "+b+" is "+c);
	 }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj = new Scanner(System.in);
		int d,e; 
		System.out.print("Enter 1st value:");
		d = obj.nextInt();
		System.out.print("Enter 2nd value:");
		e = obj.nextInt();
	    Sum obj1 = new Sum();
	    obj1.Sum(d,e);
		//System.out.println("The sum of "+a+ " and "+b+" is "+c);
        obj.close();  //Close Scanner object obj.
	}

}
