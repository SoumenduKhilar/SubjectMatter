package Samples;
import java.util.Scanner;

public class Scan {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Integer value:");
		int a = Integer.parseInt(sc.nextLine());
		System.out.print("Enter a String:");
		String b = sc.nextLine();
		System.out.println("The entered Integer is "+ a +
				" and the entered String is "+b);
		sc.close();

	}

}
