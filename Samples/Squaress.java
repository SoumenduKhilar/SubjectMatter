package Samples;
import java.util.Scanner;

public class Squaress {

	public static void main(String[] args) {
		int rem = 0, sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number:  ");
		int a = sc.nextInt();
		while(a != 0) {
			rem = a%10;  //Gets the remainder of the number.Hence gets the digits.
			sum += (rem*rem);
			a = a/10;   //Gets the quotient of the number.Hence breaks the number.
		}
		System.out.print("Square of the digits are: "+sum);
		sc.close();

	}

}
